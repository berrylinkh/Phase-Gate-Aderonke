







total_sum =0
average =0
counter =0
    
    
for number in range(1,11):

    scores= int(input("Enter scores: "))
    if (scores <0 and scores >100) :
        print("Invalid score")
    else :
        total_sum += scores;

print ("The sum is: ",total_sum)


 
