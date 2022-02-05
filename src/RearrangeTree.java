import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class RearrangeTree {

    public static void main(String[] args){
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        RearrangeTree.buildTree(preorder, inorder);

        Set<Character> s = new HashSet<>();


    }

    public static TreeNode buildTree(int[] preorder, int[] inorder){
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        int rootVal = preorder[0];
        int mid = 0;
        for(int i =0 ; i < inorder.length; i++){
            if(preorder[0] == inorder[i]){
                mid = i;
            }
        }
        System.out.println(mid);

        TreeNode left = buildTree( Arrays.copyOfRange(preorder, 1, mid+1), Arrays.copyOfRange(inorder, 0, mid));
        TreeNode right = buildTree(Arrays.copyOfRange(preorder, mid + 1, preorder.length), Arrays.copyOfRange(inorder, mid, inorder.length));
        return new TreeNode(rootVal, left, right);

    }
}
