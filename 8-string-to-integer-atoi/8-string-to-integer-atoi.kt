class Solution {
    fun myAtoi(str: String): Int {
     val numStr = extractNumFromStr(str.trim())
        val returnVal: Int
        returnVal = try {
            val long = numStr.toInt()
            when {
                long>Integer.MAX_VALUE -> Integer.MAX_VALUE
                long<Integer.MIN_VALUE -> Integer.MIN_VALUE
                else -> long
            }
        }catch (ex:NumberFormatException){
            if(numStr[0] == '-') Integer.MIN_VALUE
            else Integer.MAX_VALUE
        }
        return returnVal
    }

    private fun extractNumFromStr(str: String): String {
         val s = StringBuilder("")
        for(i in str.indices){
            if(i==0 && str[i]=='+' && i<str.length-1 && str[i+1]  !in '0'..'9'){
                break
            }
if(i==0 && str[i]=='-' && i<str.length-1 && str[i+1]  !in '0'..'9'){
                break
            }
            if (str[i] == '-' && s.isEmpty()) {
                s.append(str[i])
            } else if (str[i] in '0'..'9') {
                s.append(str[i])
            }else if(str[i] == '+'&& i==0) continue
            else{
                break
            }
        }
        if(s.isEmpty() || (s.length==1 && s.contains("-"))){
            s.clear()
            s.append("0")
        }
        return s.toString()
    }
}