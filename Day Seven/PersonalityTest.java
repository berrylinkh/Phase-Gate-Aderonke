

import java.util.Scanner;
    public class PersonalityTest {
        public static void main (String [] args) {
        Scanner scanned = new Scanner (System.in);


        System.out.println("What is your name: ");
        String name = scanned.nextLine();

        
        
        String[] optionA ={"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"};
        String[] optionB ={"A. interpret literally", "B. look for meaning and possibilities"};
        String[] optionC ={"A. logical, thinking, questioning", "B. empathetic, feeling, accommodating"};
        String[] optionD ={"A. organized, orderly", "B. flexible, adaptable"};
        String[] optionE ={"A. more outgoing, think out loud", "B. more reserved, think to yourself"};
        String[] optionF ={"A. practical, realistic, experiential", "B. imaginative, innovative, theoretical"};
        String[] optionG ={"A. candid, straight forward, frank", "B. tactful, kind, encouraging"};
        String[] optionH ={"A. plan, schedule", "B. unplanned, spontaneous"};
        String[] optionI ={"A. seek many tasks, public activities, interaction with others", "B. seek private, solitary activities with quiet to concentrate"};
        String[] optionJ ={"A. standard, usual, conventional", "B. different, novel, unique"};
        String[] optionK ={"A. firm, tend to criticize, hold the line", "B. gentle, tend to appreciate, conciliate"};
        String[] optionL ={"A. regulated, structured", "B. easy-going, live and let live"};
        String[] optionM ={"A. external, communicative, express yourself", "B. internal, reticent, keep to yourself"};
        String[] optionN ={"A. focus on here-and-now", "B. look to the future, global perspective, big picture"};
        String[] optionO ={"A. tough-minded, just", "B. tender-hearted, merciful"};
        String[] optionP ={"A. preparation, plan ahead", "B. go with the flow, adapt as you go"};
        String[] optionQ ={"A. active, initiate", "B. reflective, deliberate"};
        String[] optionR ={"A. facts, things, what is", "B. ideas, dreams, what could be", "philosophical"};
        String[] optionS ={"A. matter of fact, issue-oriented", "B. sensitive, people-oriented, compassionate"};
        String[] optionT ={"A. control, govern", "B. latitude, freedom"};

        String[][] personalityOptions = {optionA, optionB, optionC, optionD, optionE , optionF, optionG, optionH, optionI, optionJ, optionK, optionL, optionM, optionN, optionO, optionP, optionQ, optionR, optionS, optionT};
        

       System.out.println("Select option A or B: ");
       String[] userOption = new String[20];
       String option = "";


        for (int index =0; index < 20; index ++) {
            option = "";

          
        while (true) {
            System.out.println(PersonalityTestFunction.pickingTheFirstElement(personalityOptions, index)+ "   "+PersonalityTestFunction.pickingTheSecondElement(personalityOptions, index));

            String optionChoice = scanned.next(); 
            char character = optionChoice.toUpperCase().charAt(0);
        
            if (character =='A') {
            option += character;
            userOption[index] = option;
            break;
            }
            else if (character =='B') {
            option += character;
            userOption[index] = option;
            break;
            }
            else {
            System.out.println("invalid input, choose A or B");
                }
            }
        }
    }
}
