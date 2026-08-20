


let character = "a111BAcb";


function countingSpecialCharacter (word) {
    let inword = word.toLowerCase();
    let totalCounter =0;
    let allCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";
   


    for (let count = 0; count < allCharacters.length; count ++) {
        let characterCheck = allCharacters[count];
        let appearance =0;
        
        for (let index = 0; index < inword.length; index ++) {    
        if(characterCheck  === inword[index]) {
        appearance++;
            }
        }

        if (appearance > 1) {
        totalCounter ++;    
        }
    }
    return totalCounter;
}
console.log(countingSpecialCharacter(character))
 


