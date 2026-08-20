

character = "a111BAcb"

def counting_special_character (word):
    inword = word.lower()
    allCharacters = "abcdefghijklmnopqrstuvwxyz0123456789"
    total_counter =0

    for element in allCharacters:
        characterCheck = element;
        appearance =0
        
        for index in inword:   
            if (characterCheck == index):
                appearance +=1
      
        if (appearance > 1):
            total_counter +=1

    return total_counter

print(counting_special_character(character))
  

