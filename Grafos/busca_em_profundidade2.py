import networkx as nx
import matplotlib.pyplot as plt

G = nx.DiGraph()

nodes = ['A', 'B', 'C', 'D', 'E']

G.add_nodes_from(nodes)

edges = [('A', 'B'), ('B', 'A'), ('E', 'A'), ('D', 'A'), ('E', 'D'), ('E', 'C'), ('B', 'E') ]
G.add_edges_from(edges)

for node in nodes:
    start_node = node
    dfs_nodes = list(nx.dfs_preorder_nodes(G, start_node))

print('Matriz Adjacência')
matrizA= nx.adjacency_matrix(G)
print(matrizA.toarray())

print()

print('Matriz Adjacência')
matrizI= nx.incidence_matrix(G)
print(matrizI.toarray())

nx.draw(G, with_labels=True)
plt.show()