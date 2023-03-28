package findAnagrams

class FindAnagrams {

    fun findAnagrams(s: String, p: String): List<Int> {

        val resultIndexes = mutableListOf<Int>()

        for (i in 0..s.length - p.length) {
            if (isAnagram(s.substring(i, i + p.length), p))
                resultIndexes.add(i)
        }
        return resultIndexes
    }

    fun isAnagram(s: String, p: String): Boolean {
        val sMap = mutableMapOf<Char, Int>()
        val pMap = mutableMapOf<Char, Int>()
        s.forEach {
            if (sMap.containsKey(it))
                sMap[it] = sMap[it]!!.plus(1)
            else
                sMap[it] = 1
        }
        p.forEach {
            if (pMap.containsKey(it))
                pMap[it] = pMap[it]!!.plus(1)
            else
                pMap[it] = 1
        }
        return sMap == pMap

    }
}