/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxd = 0;
    int DD(TreeNode* root) {
        if(root)
        {
            int lt = DD(root->left) , rt = DD(root->right);
            if(lt+rt>maxd)
                maxd = lt+rt;

            return 1+max(lt,rt);
        }
        return 0;
        
    }
      
    int diameterOfBinaryTree(TreeNode* root) {

        if(root){
          DD(root);
          return maxd;
    }
    return 0;
    }
};