package longestMonotonousSubsequence

class LongestMonotonousSubsequence {

    fun findLongestSubsequence(arr: IntArray): Int {

        var increaseCount = 1
        var decreaseCount = 1
        var best = 1

        for(i in 1 until arr.size){

            if(arr[i]>arr[i-1]){

                increaseCount++
                val currentBest = increaseCount.coerceAtLeast(decreaseCount)
                decreaseCount=1

                best = currentBest.coerceAtLeast(best)
            }
            if(arr[i]<arr[i-1]){

                decreaseCount++
                val currentBest = increaseCount.coerceAtLeast(decreaseCount)
                increaseCount=1

                best = currentBest.coerceAtLeast(best)
            }
        }
        return best
    }

}