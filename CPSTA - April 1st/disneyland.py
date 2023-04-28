import sys

n = int(input())

# matrix containing shortest path between all pairs
mat = [[sys.maxsize for i in range(n)] for j in range(n)]

for i in range(n - 1):
    i, o, w = [int(i) for i in input().split(' ')]

    mat[i-1][o-1] = w
    mat[o-1][i-1] = w

    mat[i - 1][i - 1] = 0
    mat[o - 1][o - 1] = 0

ans = 0

# dijkstra
for source in range(n):
    # use dijkstra to find shortest path from source to all other nodes and return the max distance

    # initialize distance to all nodes to infinity
    dist = [sys.maxsize for i in range(n)]
    dist[source] = 0

    visited = [False for i in range(n)]
    parent = [-1 for i in range(n)]

    q = [source]

    while len(q) > 0:
        min_dist = sys.maxsize
        min_node = -1
        for node in q:
            if dist[node] < min_dist:
                min_dist = dist[node]
                min_node = node

        q.remove(min_node)

        for neighbor in range(n):
            if mat[min_node][neighbor] != sys.maxsize and not visited[neighbor]:
                if dist[neighbor] > dist[min_node] + mat[min_node][neighbor]:
                    dist[neighbor] = dist[min_node] + mat[min_node][neighbor]
                    parent[neighbor] = min_node
                    if neighbor not in q:
                        q.append(neighbor)

        visited[min_node] = True
    
    # get the max distance
    max_dist = 0
    for i in range(n):
        if dist[i] > max_dist:
            max_dist = dist[i]
    
    ans = max(ans, max_dist)

print(ans)