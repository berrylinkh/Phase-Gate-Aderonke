
let scoreOne = 30;
let scoreTwo = 40;
let scoreThree = 50;



function calculatingTheAverageScoreGrade ( scoreOne, scoreTwo, scoreThree)
    const averageResult =  scoreOne + scoreTwo + scoreThree / 3;
    return averageResult;
    
    }

        if (averageResult <=90 && averageResult <=100) {
            console.log("Letter Grade A");
        }

        else if (averageResult <=80 && averageResult < 90) {
            console.log("Letter Grade B");
        }
        else if (averageResult <=70 && averageResult < 80) {
            console.log("Letter Grade C"); 
        }
        else if (averageResult <= 60 && averageResult < 70) {
            console.log("Letter Grade D");
        }
        
        else if (averageResult <= 90 && averageResult <60) {
            console.log("Letter Grade F");
        
       }
    }
}





