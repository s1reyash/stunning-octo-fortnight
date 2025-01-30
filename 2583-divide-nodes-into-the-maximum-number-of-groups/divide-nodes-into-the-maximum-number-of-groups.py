class Solution:
    def magnificentSets(self, n: int, edges: List[List[int]]) -> int:
        ### UF is a hash map where you can find the root of a group of elements giving an element.
        ### A key in UF is a element, UF[x] is x's parent.
        ### If UF[x] == x meaning x is the root of its group.
        UF = {}
        
        ### Given an element, find the root of the group to which this element belongs.
        def find(x):
            ### this may be the first time we see x, so set itself as the root.
            if x not in UF:
                UF[x] = x
            
            ### If x == UF[x], meaning x is the root of this group.
            ### If x != UF[x], we use the find function again on x's parent UF[x] 
            ### until we find the root and set it as the parent (value) of x in UF.
            if x != UF[x]:
                UF[x] = find(UF[x])
            return UF[x]
        
        ### Given two elements x and y, we know that x and y should be in the same group, 
        ### this means the group that contains x and the group that contains y 
        ### should be merged together if they are currently separate groups.
        ### So we first find the root of x and the root of y using the find function.
        ### We then set the root of y (rootY) as the root of the root of x (rootX).
        def union(x, y):
            
            rootX = find(x)
            rootY = find(y)
            # set the root of y (rootY) as the root of the root of x (rootX)
            UF[rootX] = rootY
        
        ### Do a BFS on the graph given a start point.
        ### One thing we have to do is to check if the graph has a odd number edges cycle.
        ### This is done by checking the if the neighbor node has been visited before 
        ### and if the neighbor was on the same level as the current node when we were visiting the neighbor.
        def BFS(node):
            q = deque([(node,1)])
            seen = {node:1}
            level = 1
            while q:
                cur,level = q.popleft()
                for nei in graph[cur]:
                    if nei not in seen:
                        seen[nei] = level+1
                        q.append((nei,level+1))
                    ### check if there is a odd number edges cycle
                    elif seen[nei]==level: 
                        return -1
            return level
        
        ### Greating the graph
        ### Creating the connected component using Union-Find
        graph = defaultdict(list)
        for s,e in edges:
            graph[s].append(e)
            graph[e].append(s)
            union(s,e)
        
        ### Store the largest group in each connected component
        maxGroup = defaultdict(int)
        ### Start a BFS on each node, and update the maxGroup for each connected component
        for i in range(1,n+1):
            groups = BFS(i)
            ### There is a odd number edges cycle, so return -1
            if groups==-1:
                return -1
            ### Find the root of the current connected component
            root = find(i)
            ### Update it.
            maxGroup[root] = max(maxGroup[root],groups)

        return sum(maxGroup.values())