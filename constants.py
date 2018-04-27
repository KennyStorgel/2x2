def all_c_graphs(a,b,c,d):
    ret = dict()
    ret['c1'] = {a:b, b:c, c:d, d:a}
    ret['c2'] = {a:b, c:b, c:d, a:d}
    ret['c3'] = {a:b, b:c, d:c, d:a}
    ret['c4'] = {a:b, b:c, d:c, a:d}
    ret['c5'] = {b:c, c:d, d:a}
    ret['c6'] = {c:b, c:d, a:d}
    ret['c7'] = {c:b, c:d, d:a}
    ret['c8'] = {b:c, d:c, a:c}
    ret['c9'] = {b:a, d:a}
    ret['c10'] = {a:b,a:d}
    ret['c11'] = {b:a, a:d}
    ret['c12'] = {a:d, b:c}
    ret['c13'] = {a:d, c:b}
    ret['c14'] = {a:b}
    ret['c15'] = dict()
    return ret
