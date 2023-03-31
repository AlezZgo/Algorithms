package sameTree

class SameTree {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        //if p and q is null, we reach end of tree
        if (p == q) return true
        if (p?.`val` != q?.`val`) return false
        return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
    }
}
class TreeNode(var `val`: Int) {
     var left: TreeNode? = null
     var right: TreeNode? = null
 }