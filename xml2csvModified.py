import re
import sys
import codecs
from xml.etree.ElementTree import parse


def get_items(xml_file):
    root = parse(xml_file).getroot()
    return root.findall('mutation')


def extract_line(node):
    ''' given a node extract necessary info to string
        return string seperate with coma
    '''
    str = []
    for col in COL_NAMES:
                
        if type(col) is not dict:
            str.append('')
            continue
        
        v = list(col.values())
        
        values, ele, s = v[0], None, ''
        if values:
            ele = node.find(values[0])
        if ele is None:
            str.append('')
            continue

        s = ele.text
        if len(values) > 1:
            attr = values[1].split('@')
            if len(attr) > 1 and attr[1] and attr[1] in ele.attrib:
                s = ele.attrib[attr[1]]
        if s is None:
            print("WARNING:", col.keys()[0], "might not config correctly, please check!")

        str.append(sanitize(s))

    return ', '.join(str)


def sanitize(s):
    if not s:
        return ''
    if ',' in s:
        return '"' + s.replace('"', '\'') + '"'
    else:
        return s.replace('"', '\"')


def correct_col_names():
    if type(COL_NAMES) is not list:
        raise ValueError('COL_NAMES is not config correctly. Abort!')
    for col in COL_NAMES:
        if type(col) is not dict or not col.keys():
            COL_NAMES.remove(col)
            print('WARNING:', str(col), 'is not correct, ignored.')


if __name__ == '__main__':
    COL_NAMES = [
        {'Status': ['.', '@status']},
        {'File': ['./mutatedClass']},
        {'Line': ['./lineNumber']},
        {'Mutator': ['./mutator']},
        {'Index': ['./index']},
    ]
    try:
        correct_col_names()
        with codecs.open('commonscsv.csv', 'w', 'utf-8') as csv:
            csv.write(', '.join(map(lambda x: next(iter(x)), COL_NAMES)) + u'\n')
            print('Write columns to the first line of csv.')

        products = get_items('mutations.xml')
        print("Fetch the root tag from xml file..")
        print("write lines, please wait...")
        for p in products:
            # open the csv file
            with codecs.open('commonscsv.csv', 'a', 'utf-8') as csv:
                # write a new line to the file end
                csv.write(extract_line(p) + u'\n')

        del products
        print('DONE! Complete convert XML to CSV.')

    except Exception as e:
        print('Unexpected Error,', str(e), '. Failed!')
