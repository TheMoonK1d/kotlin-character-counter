fun main() {

    //Counter function
    fun count (s : String){
        val txt = s.toCharArray()
        var letter = 0
        var digit = 0
        var space = 0
        var other = 0
        for (inx in txt.withIndex()){
            /*
            * Must use value...index does not work
            *
            */
            if(Character.isLetter(inx.value)){
                letter++
            }else if (Character.isDigit(inx.value)){
                digit++
            }else if (Character.isSpaceChar(inx.value)){
                space++
            }else{
                other++
            }
        }
        println("Letter: $letter\nDigit: $digit\nSpace: $space\nOther: $other")
    }
    println("Enter a string")
    val input = readln()
    println("Total length {${input.length}}")
    count(input)
}