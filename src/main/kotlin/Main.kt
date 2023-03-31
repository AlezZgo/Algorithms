fun main(args: Array<String>) {
    intArrayOf(1, 2, 5, 6, 9, 11).reduceIndexed { index, acc, i ->
        acc + i
    }
}

class TreeNode(var entity: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}