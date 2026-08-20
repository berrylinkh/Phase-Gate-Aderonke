





total_sum =0
average =0
counter =0
    
    
for number in range(1,11):

    scores= int(input("Enter scores: "))
    if (scores % 2 == 0):
        total_sum += scores
        counter +=1
average = total_sum /counter
print ("The sum is: ",total_sum)
print ("The average is: ",average)

 
