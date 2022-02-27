class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
     var pos1 = 0
            var pos2 = 0
            val hashMap = hashMapOf<Int, Int>()
            var i = 0
            nums.forEach {
                hashMap[it] = i
                i++
            }
            for (j in nums.indices) {
                val diff =  target-nums[j]
                if (hashMap.containsKey(diff) && hashMap[diff]!! != j) {
                    pos1 = j
                    pos2 = hashMap[diff]!!
                    break
                }
            }
            return intArrayOf(pos1, pos2)      
    }
}