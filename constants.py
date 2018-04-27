def all_c_graphs(a,b,c,d):
    ret = dict()
    ret['c1'] = {a:b, b:c, c:d, d:a}
    return ret
