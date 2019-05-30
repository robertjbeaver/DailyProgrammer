//*=== Wednesday May 29th 2019 - Daily Programmer ===*
//
//*[Unique Morse Code Words]*
//
//International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to `.-`, "b" maps to `-...`, "c" maps to `-.-.`, and so on.
//
//For convenience, the full table for the 26 letters of the English alphabet is given below:
//`[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]`
//
//Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as `-.-..--...`, (which is the concatenation `-.-.` + `-...` + `.-`). We'll call such a concatenation, the transformation of a word.
//
//Return the number of different transformations among all words we have.
//
//Example:
//```Input: words = ["gin", "zen", "gig", "msg"]
//Output: 2
//
//Explanation:
//The transformation of each word is:
//"gin" -> "--...-."
//"zen" -> "--...-."
//"gig" -> "--...--."
//"msg" -> "--...--."
//
//There are 2 different transformations, "--...-." and "--...--.".```
//Note:
//• The length of words will be at most 100.
//• Each `words[i]` will have length in range [1, 12].
//• `words[i]` will only consist of lowercase letters.

fun uniqueMorseCodeWords(words: Array<String>, morseAlpha: Map<String, String> ): List<String> {
    var totalUniques = mutableListOf<String>()
    for (word in words) {
        var morseCode = ""
        for (letter: Char in word) {
            morseCode += morseAlpha.getValue(letter.toString())
        }
        if (!totalUniques.contains(morseCode)) {
            totalUniques.add(morseCode)
        }
    }
    return totalUniques
}

fun main(){
    val morseAlpha: HashMap<String, String> = HashMap()
    morseAlpha["a"] = ".-"
    morseAlpha["b"] = "-..."
    morseAlpha["c"] = "-.-"
    morseAlpha["d"] = "-.."
    morseAlpha["e"] = "."
    morseAlpha["f"] = "..-."
    morseAlpha["g"] = "--."
    morseAlpha["h"] = "...."
    morseAlpha["i"] = ".."
    morseAlpha["j"] = ".---"
    morseAlpha["k"] = "-.-"
    morseAlpha["l"] = ".-.."
    morseAlpha["m"] = "--"
    morseAlpha["n"] = "-."
    morseAlpha["o"] = "---"
    morseAlpha["p"] = ".--."
    morseAlpha["q"] = "--.-"
    morseAlpha["r"] = ".-."
    morseAlpha["s"] = "..."
    morseAlpha["t"] = "-"
    morseAlpha["u"] = "..-"
    morseAlpha["v"] = "...-"
    morseAlpha["w"] = ".--"
    morseAlpha["x"] = "-..-"
    morseAlpha["y"] = "-.--"
    morseAlpha["z"] = "--.."

    for (item in uniqueMorseCodeWords(arrayOf("gin", "zen", "gig", "msg"), morseAlpha))
        println(item)
}
