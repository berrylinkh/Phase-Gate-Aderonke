
score_one = 30
score_two = 55
score_three =40




def calculating_the_average_score_grade (score_one, score_two, score_three ):
    averageResult =  score_one + score_two + score_three / 3 

    if (90 <= averageResult <=100):
        print("Letter Grade A")

    elif (80<= averageResult <90):
        print ("Letter Grade B")

    elif (70 <= averageResult < 80):
        print("Letter Grade C")

    elif (60 <= averageResult <= 70):
        print ("Letter Grade D")
    

    elif (0 <= averageResult <= 60):
        print ("Letter Grade F")

    return averageResult 

    

print (calculating_the_average_score_grade (score_one, score_two, score_three))
 
