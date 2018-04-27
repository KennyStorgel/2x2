import all_2x2_configurations as cf
import all_2x2_in_3x3 as tt

# A 6-cylce digraph with only c1, c3, c4
good_graph = {1:{2, 3}, 2:{5, 8}, 3:{2, 9}, 4:{1, 7}, 5:{4, 6},
     6:{3, 4, 9}, 7:{1, 8}, 8:{5}, 9:{7:9}}

set_of_cf = set()

for square in tt.list_of_2x2:
    a, b, c, d = square
    configurations = cf.all_c_graphs(a,b,c,d)
    our_square = dict()
    if b in good_graph[a]:
        our_square[a] = b
    else:
        our_square[b] = a
    if c in good_graph[b]:
        our_square[b] = c
    else:
        our_square[c] = b
    if d in good_graph[c]:
        our_square[c] = d
    else:
        our_square[d] = c
    if a in good_graph[d]:
        our_square[d] = a
    else:
        our_square[a] = d    
    set_of_cf.add(list(configurations.keys())[list(configurations.values()).index(our_square)])
    
