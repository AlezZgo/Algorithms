package summaryRanges

class SummaryRanges {

    fun summaryRanges(nums: IntArray): List<String> {
        val mutableList = mutableListOf<String>()

        if(nums.isEmpty())
            return emptyList()

        val buffer = mutableListOf(nums[0])

        for(i in 1 until nums.size){
            if(nums[i]==buffer.last()+1)
                buffer.add(nums[i])
            else{
                if(buffer.size>1)
                    mutableList.add("${buffer.first()}->${buffer.last()}")
                else
                    mutableList.add("${buffer.first()}")
                buffer.clear()
                buffer.add(nums[i])
            }
        }

        if(buffer.size==1)
            mutableList.add("${buffer.first()}")
        else if( buffer.size>1)
            mutableList.add("${buffer.first()}->${buffer.last()}")

        return mutableList.toList()
    }

}