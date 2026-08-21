

number = 38;
total_sum =0
add = 0
def collect_integer_number(number):
    reverse = (number //10) % 10;
    reverse2 = number %10;
    add = reverse +reverse2; 

    new_reverse = (add  //10) % 10;
    new_reverse2 = add  %10;
    total_sum = new_reverse + new_reverse2;

    return total_sum
print (collect_integer_number(number)) 


#lists = {2,2,1}
#value = lists[0];
#counter = 0;
#
#def pick_one_element_thatexist(number):
#
#    for element in number(lists):
#        if (element[lists] != value): 
#            counter +=1
#    return counter
#print(pick_one_element_thatexist(lists))
#         

    
