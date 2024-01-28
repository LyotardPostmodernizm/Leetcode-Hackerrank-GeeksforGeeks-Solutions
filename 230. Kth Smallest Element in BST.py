# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        stack = []
        current = root 
        
        while True:
            while current: #DFS Inorder Traversal 
                stack.append(current)
                current = current.left

            current = stack.pop() #smallest node is popped.
            k -= 1

            if k == 0:
                return current.val
                
            current = current.right
