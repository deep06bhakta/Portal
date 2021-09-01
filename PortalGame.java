/*
* Coby Alvarez
* Deep Bhakta
* Ashley Tran
* Daniel Mendes
* Roger Roldan

* Course Number: CS 2011

* Section Number: 07

* Description: The Portal game features challenges and obstacles that the Player
* will have to overcome in order for them to clear the game. The game revolves
* around the theme about the player being a prisoner where in order for him to
* be granted freedom from the authorities, he/she will have to clear the
* challenges and obstacles ahead of them using portals to continue moving
* forward on to the next challenge towards freedom.
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class PortalGame{
  public static void main(String[] args) {


    if (args.length != 0  && args[0].equalsIgnoreCase("-help")) {
      optionHelp();
      System.exit(0);
    }
    if(args.length != 0 && args[0].equalsIgnoreCase("-thirdQuestion")){
      displayThirdQuestion();
    }

    mainCode();
  }
  // This method is called in the main method where if the user wants the option
  // help then the method will give the user hints and rules about the game in
  // general and each big parts of the game.
  public static void optionHelp() {
    Scanner input = new Scanner(System.in);
    System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("\tRULES AND REGULATIONS: \n\t~~~~~~~~~~~~~~~~~~~~~~" +
                       "\n#1 Do not cheat. \n#2 Answer at the best of your abil"
                       + "ity. \n#3 FIRST read carefully and THEN answer. You d"
                       + "o the task or you die.");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Game 1 Rules and Hints: ");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("For the first game, you will need to defeat the enemy" +
                       "\nin order to esacpe from portal 1 and proceed to porta"
                       + "\nl 2." );
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Game 2 Rules and Hints: ");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("For the second mini game, you will be tasked with the" +
                       "\nobjectives of solving a murder mystery, then your\nme"
                       + "mory will be tested and at last\nyou will be prompted"
                       + " with mathematical questions");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Game 3 Rules and Hints: ");
    System.out.println("For the final mini-game, you will have to answer a\nser"
                       + "ies of questions related to material we have"
                       + "\nlearned in class. Once obtaining\nkeys from 3 of th"
                       + "e 7 questions asked.\nYou will be prompted to choose "
                       + "out of 3 portals that\nwill determine your fate in th"
                       + "e game.");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    System.out.println("For hints on the questions in the minigame themselves,"
                        + " type 'X'.");
    String moreHelp = input.nextLine();
      if(moreHelp.equalsIgnoreCase("X")){
        System.out.println("Q2. [An empty space/Nothingness] \nQ3. [It reads tr"
                            + "ue] \nQ.4 [Antonym of short] \nQ.5 [Look at the"
                            + " length] \nQ.6 [A big pile of stuff] \nQ.7 [el(s"
                            + "e) + if]");
      }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("");


  }

/* mainCode method serves as the start menu for the game along with an into to
 the plot. */
  public static void mainCode() {
    Scanner input = new Scanner(System.in);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.print("What is your name? ");
    String name = input.next();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    char A = name.charAt(0);
    char B = name.charAt(1);
    int randomNum = (int)(Math.random()*(69));
    int prisonNum = (' ' + (A + B * randomNum));
    System.out.print("Your Prison number is ");
    System.out.println(prisonNum + ". There is no escape,\ntry to enjoy the" +
                      " rest of your futile life!");
    pause(2000);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("I am an AI deisgned for assisting in field research. In"
                       + " accordance with military orders and your compliance "
                       + "with being a test subject to clear your prison senten"
                       + "ce, you will complete a series of challenges put forth"
                       + " by me. Failure to comply is punishable by death. Fai"
                       + "lure to complete the challenges and pass through the "
                       + "portals is punishable by death. Do you wish to procee"
                       + "d? (Yes/No).");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    String firstDec = input.next();
    if (firstDec.equalsIgnoreCase("Yes")){
      System.out.println("Here you go, enjoy!");;
      enemyAttack();
    }
    else if (firstDec.equalsIgnoreCase("No")){
      System.out.println("YOU SERVED A 50 YEAR SENTENCE SAD.");
    }
    else{
      System.out.println("Please type 'Yes' or 'No'.");
    }
  }
/* pause method serves as a sleep function, which creates a pause between actions
along with an parameter that sets how long that pause is in milliseconds.
The credit and inspiration goes to Professor Weronika. Thank You */
  public static void pause(long milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException ie) {}
  }
// unlock method serves as the last challenge of the game.
  public static void unlock(){
    Scanner input = new Scanner(System.in);
    // Declaring variable 'correctAnswers' to store # of correct answers
    int correctAnswers = 0;
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                       + "~");
    System.out.println("You're nearly free. You're in a room with 3 portals."
                    + "\nThere are a total of 7 highly sophisticated questions,"
                    + "\n3 keys will be incentivized at random, as 3 questions"
                    + "\ncontain keys. Good luck and for your life's sake, do"
                    + "\nyour best at getting all the questions correct. \n~~"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    // Add hint to the ~help (prisoner number answer to number 1)
    System.out.println("1. What is your name?");
    String firstAnswer = input.nextLine();
    // If else statements to send demeaning message if user answers incorrectly
    if(firstAnswer != ""){
      System.out.println("[Wrong. Incompetent human. You have no name; just a m"
                         + "easly test subject.]");
    }
    // Add hint w/wordplay using 'void'...
    System.out.println("");
    System.out.println("2. What's the return type of the main method?");
    String secondAnswer = input.nextLine();
    if((secondAnswer.equalsIgnoreCase("void"))){
      // Incrementing 'correctAnswers' if user answers correctly to certain ?'s
      correctAnswers += 1;
      // Ascii art of keys created by ourselves
      System.out.println("       ()"
                         + "\n      ()()"
                         + "\n    (()()())"
                         + "\n       VV"
                         + "\n       || "
                         + "\n       || "
                         + "\n       ||___"
                         + "\n       ||---");
      System.out.println("");
    }
    else {
      System.out.println("[Incorrect. YOU FOOL.]");
      System.out.println("");
    }
    System.out.println("3. Is for ( ; ; ); valid?(Enter Y/N.)");
    String thirdAnswer = input.nextLine();
    if(thirdAnswer.equalsIgnoreCase("Y")){
      System.out.println("");
      correctAnswers += 1;
      // Ascii art of keys created by ourselves
      System.out.println(" ..          | | |"
                         + "\n:  :---------|o|o|"
                         + "\n'..'");
      System.out.println("");
    }
    else{
      System.out.println("[HAHAHA. You are replacable.]");
      System.out.println("");
    }
    System.out.println("4. Which data type holds the most memory?");
    String fourthAnswer = input.nextLine();
    if(!fourthAnswer.equalsIgnoreCase("long")){
      System.out.println("[Would you like to phone a friend? LOL. JK.]");
    }
    System.out.println("");
    System.out.println("5. How many elements are in this array: double[] list ="
                       + " new double[7]? (Enter words only.)");
    String fifthAnswer = input.nextLine();
    if(!fifthAnswer.equalsIgnoreCase("seven")){
      System.out.println("[Lucky number 7, but not so lucky for you.]");
    }
    System.out.println("");
    System.out.println("6. What is the area of memory that the Java Virtual Mac"
                       +"hine stores the array called?");
    String sixthAnswer = input.nextLine();
    if(sixthAnswer.equalsIgnoreCase("heap") || sixthAnswer.equalsIgnoreCase("he"
                                               + "ap memory")){
      correctAnswers+=1;
      // Ascii art of keys created by ourselves
      System.out.println("             ______"
                         + "\n            /   o  \\"
                         + "\n           |        |"
                         + "\n            \\      /"
                         + "\n             '----' "
                         + "\n               {}"
                         + "\n               {}"
                         + "\n               {}~~~"
                         + "\n               {}~~");
    }
    else{
      System.out.println("[Nope.]");
    }
    System.out.println("");
    System.out.println("7. What is else if in Python?");
    String seventhAnswer = input.nextLine();
    if (!(seventhAnswer.equalsIgnoreCase("elif"))){
      System.out.println("[HaD yOu EvEn GoNe To ScHoOl? ;P]");
    }
    System.out.println("");
    // Switch statement for # of correct answers and the outcome of the minigame
    switch(correctAnswers){
      // If user gets none of the 'random' questions w/keys correct, the game
      // ends
      case 0:
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                           + "~~");
        System.out.println("Couldn't even get 1.\nCongratulations on being "
                           + "unsuccesful & pathetic. "
                           +"\n                               GAME OVER. ):");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                           + "~~");
        System.exit(0);
      /* If user gets 1 key, the probability of escaping are lower than if they
         had earned 2-3 keys */
      case 1:
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                           + "~~");
        System.out.println("You've scored a total of " + correctAnswers
                           + " correct answers out of 3,\nearning 1 key. Your c"
                           + "hances of escaping are 1/7, are \nyou going to"
                           +" take that chance? (Y/N).");
      /* Getting user input on whether they want to risk it to escape w/ lowered
         probability or not */
      String escape = input.nextLine();
      // If statement based on their choice to escape or not
      if(escape.equalsIgnoreCase("Y")){
        // Ascii Art sourced from https://ascii.co.uk/art/circle
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Which portal are you going to take?");
        System.out.println("        o  o              +  +"
                           + "\n     o        o        +        +"
                           + "\n    o     A    o      +     B    +"
                           + "\n    o          o      +          +"
                           + "\n     o        o        +        +"
                           + "\n        o  o              +  +");
        System.out.println("                ,gPPRg,"
                           + "\n               dP'   `Yb"
                           + "\n               8)  C  (8"
                           + "\n               Yb     dP"
                           + "\n                '8ggg8'");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        char portalChoice = input.next().charAt(0);
        char ch1 = Character.toUpperCase(portalChoice);
        /* Switch statement to run through the potentialities of their portal
           choice based on user input */
        switch(ch1){
          case 'A':
            System.out.println("You are back at your parent's house"
                               + ", will they turn you in?");
            /* Incorporates probability (1/7) announced before based on mini-
               game result w/ boolean and random number from */
            boolean test = new Random().nextInt(8)== 1;
            // Checking boolean and if true, positive outcome is presented
            if (test){
              System.out.println("They embrace their kin with open arms. They"
                                 + " say,'We could never turn our baby in'."
                                 + "                               Yay. Happy"
                                 + " Living!");
              System.exit(0);
            }
            else{
              System.out.println("They call the authorities immediately."
                                  + " They say, 'You need to face the "
                                  + "consequences of your actions!' R.I.P.");
              System.out.println("                               GAME OVER.");
          }
          System.exit(0);
          // Negative result w/ 1 key and choosing portal 'B'
          case 'B':
            System.out.println("You are in front of the local Police Station."
                                + " Better start running ^_^");
            System.exit(0);
          // Negative result w/ 1 key and choosing portal 'C'
          case 'C':
            System.out.println("You step through the portal and arrive inside"
                               + "\n the cold, damp cell that held you\nbefore"
                               + " you had started trying to escape.");
            System.exit(0);
          /* The default result would be a result of the users input being
             invalid */
          default:
            System.out.println("You got caught so enjoy the rest of your life"
                               + " in the facility");
            System.out.println("                         Game over! (￣T￣)");
            System.exit(0);
        }
        System.exit(0);
      }
      /* Else statement that ends the game if user does not want to risk going
         through the portals */
      else{
        System.out.println("That was all for naut, rot in your cell.");
        System.out.println("                         Game over! (-_-)");
        System.exit(0);
      }
      // Script that will be prompted if user obtains 2 keys
      case 2:
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                           + "~");
        System.out.println("You've scored a total of " + correctAnswers +
                           " correct" + " answers out of 3," +
                           "\nearning 2 keys. Your chances of escaping are 3/7,"
                           + "\nare you going to take that chance? (Y/N).");
        String escapeTwo = input.nextLine();
        // If statement based on their choice to escape or not
        if(escapeTwo.equalsIgnoreCase("Y")){
          // Ascii Art sourced from https://ascii.co.uk/art/circle
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          System.out.println(" Which portal are you going to take?");
          System.out.println("        o  o              +  +"
                             + "\n     o        o        +        +"
                             + "\n    o          o      +          +"
                             + "\n    o    A     o      +     B    +"
                             + "\n     o        o        +        +"
                             + "\n        o  o              +  +");
          System.out.println("                ,gPPRg,"
                             + "\n               dP'   `Yb"
                             + "\n               8)  C  (8"
                             + "\n               Yb     dP"
                             + "\n                '8ggg8'");
          System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          char portalChoiceTwo = input.next().charAt(0);
          char ch2 = Character.toUpperCase(portalChoiceTwo);
          // If statements based on user's choice of portals
          if (ch2 == 'A'){
            // Incorporating probabilty through Math.random
            int chance = (int)(Math.random() * (8));
            /* Since w/ 2 keys, the user has increased their chances of escape
               to 3/7, thus based on randomly generated #, 3/7 will trigger an
               alright outcome */
            if (chance == 2 || chance == 4 || chance == 6){
              System.out.println("You hear the portal rip as if fabric had been"
                                + " torn and open your eyes to see the Eiffel"
                                + " tower. But, it's dustier here than France"
                                + ",you notice a big fountain and realize, sh"
                                + "oot, you're in Vegas ('_'<)! Well, slightl"
                                + "y better than the facility, right?");
              System.out.println("MEDIOCRE END! Try harder next time -_- .");
              System.exit(0);
            }
            else{
              System.out.println("It just really isn't your day. The portal bel"
                                 + "ches and spits you back into the cell you"
                                 + " had started from.");
              System.out.println("                              GAME OVER. );");
              System.exit(0);
             }
          }
          // If they choose portal 'B', they will end up dying
          else if(ch2 == 'B'){
            System.out.println("You jump through the portal of crosses, manif"
                               + "esting serene, warm places. You open your"
                               + " eyes to find that you are in Vatican City"
                               + " and the Vatican police accuse you of here"
                               + "sy and being a witch. They plan to burn you "
                               + "at the stake.");
                               System.out.println("                            "
                               + " GAME OVER! ):");
            System.exit(0);
          }
          else if(ch2 == 'C') {
            /* Incorporating probability once more (refer to previous nested if
               statement) */
            int chanceAgain = (int)(Math.random() * (8));
            if (chanceAgain == 2 || chanceAgain == 4 || chanceAgain == 6){
              System.out.println("You take the portal and end up somewhere th"
                                 + "at is strikingly white.");
              System.out.println("'Heaven?', you think to yourself. You hear "
                                 + "demonic screeching and the white padding"
                                 + " seems to fracture as a door opens and a "
                                 + "nurse walks through.");
              System.out.println("'Pill time, and show me your tongue after "
                                 + "you take 'em.' You're in a mental hospit"
                                 + "al, still better than that other facility"
                                 + " though.");
              System.out.println("                             MEDIOCRE END!");
              System.out.println("                   Better luck next time.|:");
              System.exit(0);
            }
            /* If randomness is not in their favor, the user will end up dead in
               a wishing well */
            else {
              System.out.println("You spawn in a dark, dank well and look abo"
                                 + "ve to see ominous storm clouds. There's "
                                 + " no way to get out and nobody within a"
                                 + " 50-mile radius.");
              System.out.println("You meet your demise in a place in which "
                                 + "people wish upon.");
              System.out.println("                             GAME OVER! ):");
              System.exit(0);
            }
          }
          /* Else statement that compensates if user does not enter appropriate
             input */
          else{
            System.out.println("Wow good job dummy, no choice means no life");
            System.exit(0);
          }
        }
        /* Else statement when user has 2 keys but does not want to risk their
           life to escape */
        else{
          System.out.println("Well, good riddance. It has truly been a displeas"
                             + "ure to know you.");
          System.out.println("                             GAME OVER!");
          System.exit(0);
      }
      // Trigers a happy end if the user were to obtain all 3 keys
      case 3:
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                           + "~");
        System.out.println("You've scored a total of " + correctAnswers + " cor"
                           + "rect answers out of 3,\nearning all three keys "
                           + "which means you can safely\ntravel through these"
                           + " portals.");
        // Ascii Art sourced from https://ascii.co.uk/art/circle
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("    Which portal are you going to take?");
        System.out.println("        o  o              +  +"
                           +"\n     o        o        +        +"
                           +"\n    o    A     o      +    B     +"
                           +"\n    o          o      +          +"
                           +"\n     o        o        +        +"
                           +"\n        o  o              +  +");
        System.out.println("                ,gPPRg,"
                           + "\n               dP'   `Yb"
                           + "\n               8)  C  (8"
                           + "\n               Yb     dP"
                           + "\n                '8ggg8'");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\nSince you're not like the other humans, you"
                           + "\nwill be free to choose which destination"
                           + "\nyou'd like go to. Portal A is Hawaii, Portal"
                           + "\nB is Alaska, Portal C is New York :)."
                           + " \n(Please choose: A, B, or C.)");
        // This takes your input answering which portal
        char portalChoiceThree = input.next().charAt(0);
        /* This is assigned here to ch3 and made uppercase if the user inputs a
           lowercase letter */
        char ch3 = Character.toUpperCase(portalChoiceThree);
        switch(ch3){
          /* If the user chooses A it will continue through case A &
             end in Hawaii */
          case 'A':
            System.out.println("                               Hawaii, here you"
                               + " come!");
            System.out.println("The weather is just right, with white sands and"
                               + " crystal clear water. You enjoy paradise as y"
                               + "our butler brings you a piña-colada.");
            // Ascii art sourced from: https://ascii.co.uk/art/hawaii
            pause(3000);
            System.out.println("_\\/_                 |                _\\/_" +
                              "\n/o\\\\             \\       /            //o\\"
                              + "\n |                 .---.                | " +
                              "\n_|_______     --  /     \\  --     ______|__" +
                              "\n         `~^~^~^~^~^~^~^~^~^~^~^~`");
            System.out.println("                              Good Game! (^◇^)"
                               + " ");
            System.exit(0);
            /* If the user entered B it will continue through case B & go to
               Alaska */
            case 'B':
              System.out.println("                               On the way to "
                                + "Alaska!");
              System.out.println("The air is crisp and beautiful, picturesque s"
                                 + "now greets you. Ahead lies your solace: a w"
                                 + "ooden cabin with a fresh fire and the aroma"
                                 + " of chocolate chip cookies seep through the"
                                 + " door.");
              // Ascii Art sourced from:
              // https://www.asciiart.eu/buildings-and-places/houses
              pause(3000);
              System.out.println("                                   /\\ " +
                                 "\n                              /\\  //\\\\" +
                                 "\n                       /\\    //\\\\///\\\\"
                                 + "\\        /\\\n                      //\\\\"
                                 + "  ///\\  ////\\\\\\\\  /\\  //\\\\\n       "
                                 + "  /\\  /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\n"
                                 + "        / ^\\    /\\  / ^   /  ^/ ^ ^ ^   "
                                 + "^\\ ^/  ^^  \\\n       /^   \\  / ^\\/ ^ ^ "
                                 + "   ^ / ^  ^    ^  \\/ ^   ^  \\       *\n  "
                                 + "    /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ___"
                                 +"_  ^   ^  \\     /|\\  \n     / ^ ^  ^ \\ ^ "
                                 + " _\\___________________|  |_____^ ^  \\   /"
                                 + "||o\\\n    / ^^  ^ ^ ^\\  /________________"
                                 + "______________\\ ^ ^ \\ /|o|||\\ \n   /  ^ "
                                 + " ^^ ^ ^  /________________________________"
                                 + "\\  ^  /|||||o|\\ \n  /^ ^  ^ ^^  ^    ||_"
                                 + "__|___||||||||||||___|__|||      /||o||||||"
                                 + "\\       | \n / ^   ^   ^    ^  ||___|___||"
                                 + "||||||||||___|__|||          | |           "
                                 + "|\n/ ^ ^ ^  ^  ^  ^   |||||||||||||||||||||"
                                 + "|||||||||oooooooooo| |ooooooo  |\n  OOOoooo"
                                 + "ooooooooooooooooooooooooooooooooooooooooooo"
                                 + "ooooooo ");

              System.out.println("                             Good Game! (^ o"
                                 + "^)");
              System.exit(0);
;
          /* If the user entered C it will continue through case C and go to
             New York */
          case 'C':
            System.out.println("                               New York," + "Ne"
                               + "w You.");
            // Ascii art sourced from: https://ascii.co.uk/art/newyork
            System.out.println("Enjoy your penthouse in Manhattan with your "
                               + "beautiful view of Central Park. Everyone look"
                               + "s like ants from up here and the soft drizzle"
                               + " the rain cleanses the city while making your"
                               + " position even more desirable.");
            pause(3000);
            System.out.println("          __  __" + "\n         |. ||. |    .|"
                               + "\n         || ||| |    | |                W" +
                               "\n         |: ||: |    |'|               [ ]" +
                               "._____" + "\n         |  ||  |   |  |     .--'|"
                               + "3   .--- | |.   |'" + "\n     _   |  ||  |-."
                               + " |  | __  |.  |     /|  _|__  | ||   |__"
                               + "\n  .-'|  _|  ||  | ||   '-  | ||    \\|// /"
                               + " |   |' | |    | |'" + "\n  |' | |.|  ||  | |"
                               + "|       '-'    -( )-|  |   |  | |    | |"
                               + "\n__|  '-' '  ''  ' ''       '       J V |  `"
                               + "   -  |_'    ' |__\n                         "
                               + "    ___  '    /\n                            "
                               + " \\  \\/    |");
            System.out.println("                               Good Game! (•‿•"
                               + ")");
            System.exit(0);

          default:
            // If the input was invalid, the user will get this result
            System.out.print("Your indecisiveness has been the death of you.");
            System.exit(0);

        }
    }
  }
/* enemyAttack method sets the number of hp points an enemy attack takes from
 the player randomly */
    public static void enemyAttack() {
      Scanner in = new Scanner(System.in);
      Random rand = new Random();

      // Array of 'enemies' that will be randomly dispensed to user
      String[] enemies = {"Al Chapone", "Roy Gardner", "Frank Morris"};

      int maxEnemyHealth = 80;
      int enemyAttackDamage = 15;

      // Player's variables that represent their game statistics
      int health = 100;
      int attackDamage = 25;
      int numHealthPots = 3;
      int healthPotionsHeal = 30;

      boolean run = true;

      System.out.println("Welcome to the first portal to escape of Alcatraz."
      + " Defeat the enemy and esacpe");

      // GAME_RUNNING:

      /* Here is the while loop that helps the game running till the variable
         run remains true */
      while (run) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int enemyHealth = 100;
        String enemy = enemies[rand.nextInt(enemies.length)];

        System.out.println("\t ## " + enemy + " appeared! ##\n");
        // While loop that executes script of options till the enemy dies
        while (enemyHealth > 0) {
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-"
                            + "~~~");
          System.out.println("\tYour health: " + health);
          System.out.println("\t" + enemy + "'s health " + enemyHealth);
          System.out.println("\n\tWhat would you like to do ?");
          System.out.println("\t1. Attack");
          System.out.println("\t2. Drink health potion");
          System.out.println("\t3. Get killed");
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                            + "~~~~~");
          System.out.println("Remember you will need to attack the enemy till "
                            + "he runs out of health in order to esacpe!!");
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                            + "~~~~~");

          // Takes the user input as a string and checks it using if statements
          String userInput = in.nextLine();
          // This if statement checks for option 1
          if (userInput.equalsIgnoreCase("1")) {
            int damageDealt = rand.nextInt(attackDamage);
            int damageTaken = rand.nextInt(enemyAttackDamage);

            /* Here is the part that controls the damage that will be done in
               the first attack to the enemy and the user */
            enemyHealth -= damageDealt;
            health -= damageTaken;

            System.out.println("\t--> You attacked " + enemy + " for "
                              + damageDealt + "% of damage");
            System.out.println("\t--> You have received " + damageTaken
                              + "% of damage in this battle!");

            if(health < 1) {
              System.out.println("\t * You are weak to proceed because of the "
                                + "damage dealt from the enemy");
              break;
            }
          }
          // This if statement checks for option 2 and runs the effect
          else if(userInput.equalsIgnoreCase("2")) {
            if (numHealthPots > 0) {
              health += healthPotionsHeal;
              numHealthPots--;

              System.out.println(" You drank a health potion, healing for "
              + healthPotionsHeal + "."
              + "\n\t --> You now have " + health + "% of health"
              + "\n\t --> You have " + numHealthPots
              + " health pots remanining");
            }
            else {
              System.out.println("\t --> You have no health pots left!");
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                               + "~~~~~~~~");
            }
          }
          // This if statement checks for option 3
          else if(userInput.equalsIgnoreCase("3")){
            System.out.println("\t --> You died");
            System.exit(0);
          }
          // This if statement checks for invalid input
          else {
            System.out.println("Enter a valid command!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                             + "~~~~~~~~");
          }

          /* Here, if the health of the user is less than needed to survive, the
             game ends */
          if (health < 1) {
            System.out.println("You are too weak to break out of the Alcatraz! "
                             + "Have a badge of shame to hell");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                             + "~~~~~~~~");
          }
          /* Here, if the enemies health is less for survival then the boolean
             expression that is inside the while loop changes from true to false
             which ends the loop */
          else if (enemyHealth < 1) {
            run = false;
          }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         + "~~~~~~~~");
        System.out.println(" ** " + enemy + " was defeated **");
        System.out.println(" ** You have survived with " + health
                          + "% of health **");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         + "-------");
        System.out.println("You have opened a new portal to esacpe "
                         + "the Alcatraz");
        System.out.println("What would you like to do ?" +
        "\n 1. Enter the next portal to proceed escaping. " +
        "\n 2. Get caught !");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         + "~~~~~~~~");
        String userInputAgain = in.nextLine();
        if (userInputAgain.equalsIgnoreCase("1")){
          rogersChunk();
        }

        else if (userInputAgain.equalsIgnoreCase("2")){
          System.out.println("Poor choice!. You are dead!!");
          System.exit(0);
        }


      }
    }
    // This method begins the second challenge of the game.
    public static void rogersChunk(){
      Scanner input = new Scanner(System.in);
      lineGenerator(20);
      System.out.println("");
      System.out.println("Congratulations on completing the first challenge.");
      System.out.println("Now let's move on to the next challenge, prisoner.");
      System.out.println("");
      lineGenerator(20);
      System.out.println("");
      System.out.println("You are now to be given a series of questions to te");
      System.out.println("st your cognitive ability.");
      System.out.println("");
      System.out.println("The first question will test your logical reasoning");
      System.out.println("The second question will test you memory.");
      System.out.println("The third and final question will test you "
                      +  "mathematical ability.");
      System.out.println("");
      System.out.print("Do you wish to proceed?: ");
      int i = 0;
  /* do while continues as long as the input is invalid (if input is
  not yes or no) */
      do{
        String firstDecision = input.nextLine();
        if(firstDecision.equalsIgnoreCase("yes")){
          firstQuestion();
          i += 1;
        }
        else if(firstDecision.equalsIgnoreCase("no")){
          System.out.println("Understood. Please wait until personnel escort "
                           + "you to await execution.");
          System.exit(0);
        }
        else{
          System.out.println("Please enter a valid command");
        }
      }
      while(i < 1);
    }
/* a method that generates the horizontal line borders, with the input being
 the number of lines that are printed- pretty handy tools.*/
    public static void lineGenerator(int numLines){
      for(int i = 0; i < numLines; i++){
        System.out.print("~");
      }
    }
/* This pretty much does the same thing, only printing vertical lines.
This was used to create the 6x6 grid for one of the second challenge's games*/
    public static void lineGeneratorVertical(int numLines){
      for(int i = 0; i < numLines; i++){
        System.out.print("|");
      }
    }
// First question of the second challenge is a mystery murder game.
    public static void firstQuestion(){
      lineGenerator(20);
      System.out.println("");
      System.out.println("First Question: ");
      System.out.println("Imagine you're a detective trying to find a culprit r"
                         + "sponsible for a murder");
      System.out.println("For the sake of time, imagine you manage to narrow a "
                         + "list down to 5 suspects");
      System.out.println("");
      System.out.println("| 1 |   | 2 |   | 3 |   | 4 |   | 5 |");
      lineGenerator(40);

      System.out.println("");
      System.out.println("");
  /* The exercise commands list specify the commands needed to access the
  scenario and suspects, exit the game,and decision making in the murder scenario.
  */
      System.out.println("Exercise commands:");
      lineGenerator(10);
      System.out.println("");
      System.out.println("Accessing the backstory of the murder is done by typi"
                         + "ng 'background'.");
      System.out.println("");
      System.out.println("You can access the information of these suspects by t"
                         + "yping 'search'.");
      System.out.println("This is followed by a message asking you to input the"
                         + " subject of interest's number.");
      System.out.println(" ");
      System.out.println("Once you make your decision, type 'finalize' onto the"
                         + " console.");
      System.out.println("A message will follow, which asks you to input your s"
                         + "uspects name.");
      System.out.println("");
      System.out.println("Remember you can quit anytime by either typing 'exit "
                         + "program', or typing in '0'");
      System.out.println("This depends on when the program either asks you for "
                         + "a integer or string input.");
      System.out.println("");
      System.out.println("Good luck prisoner.");
      lineGenerator(40);
      decisionPoint();
    }
/* The decisionPoint method is what runs when the 'search' command is used.
This is followed by the program asking for the suspect's designated number
according to the diagram presented in the game. Doing this allows the Player
to access each of the suspect's names and backgrounds. This method also
contains the commands 'exit program', 'finalize', and 'background.'.
'finalize' essentially leads to another method 'final decision', which
allows you to decide who's the murderer.


*/
    public static void decisionPoint(){
      Scanner input = new Scanner(System.in);
      System.out.println("");
      System.out.print("What would you like to do?: ");
      String decision = input.nextLine();

      if(decision.equalsIgnoreCase("search")){
        System.out.print("Who's background would you like to search for?: ");
        int search = input.nextInt();
        if(search == 1){
          searchSuspectInfo(1);
        }
        else if(search == 2){
          searchSuspectInfo(2);
        }
        else if(search == 3){
          searchSuspectInfo(3);
        }
        else if(search == 4){
          searchSuspectInfo(4);
        }
        else if(search == 5){
          searchSuspectInfo(5);
        }
  // '0' is basically the exit command for integer inputs.
        else if(search == 0){
          System.out.println("Understood. Please stand by to await execution.");
          System.exit(0);
        }
      }
      /* typing 'background' leads to story method, which contains the game's
       plot */
      else if(decision.equalsIgnoreCase("background")){
        story();
      }
/* Typing 'finalize' leads to the finalDecision method that has the outcomes for
the challenge depending on what suspect you choose. */
      else if(decision.equalsIgnoreCase("finalize")){
        finalDecision();
      }
  /*'exit program' is basically a quit button for the entire game. */
      else if(decision.equalsIgnoreCase("exit program")){
        System.out.println("Understood. Please stand by to await execution.");
        System.exit(0);
      }
      else{
        System.out.println("Please enter a valid command: ");
        lineGenerator(20);
        System.out.println("");
        decisionPoint();
      }
    }
/* This method contains the suspect's info, and depending on the parameter number
 it allows you to access the information of a certain suspect.*/
    public static void searchSuspectInfo(int i){
      Scanner input = new Scanner(System.in);
      if(i == 1){
        lineGenerator(20);
        System.out.println("");
        System.out.println("");
        System.out.println("Name: Roger Roldan");
        System.out.println("Age: 18");
        System.out.println("Likes: reading, playing video games");
        System.out.println("Statement: ");
        System.out.println("I couldn't have killed him because I was at work.");
        System.out.println("trying to finish a project.");
        System.out.println("");
        System.out.println("");
        lineGenerator(20);
      }
      else if(i == 2){
        lineGenerator(20);
        System.out.println("");
        System.out.println("");
        System.out.println("Name: Ashley Tran");
        System.out.println("Age: 18");
        System.out.println("Likes: Puzzles, hanging out with friends");
        System.out.println("Statement: ");
        System.out.println("I took a vacation from work and was walking my dog "
                           + "in the park that day.");
        System.out.println("");
        System.out.println("");
        lineGenerator(20);
      }
      else if(i == 3){
        lineGenerator(20);
        System.out.println("");
        System.out.println("");
        System.out.println("Name: Deep Bhakta");
        System.out.println("Age: 18");
        System.out.println("Likes: Traveling");
        System.out.println("Statement: ");
        System.out.println("I was on a flight headed to Russia that day and spe"
                           + "nt that week skiing in Moscow.");
        System.out.println("");
        System.out.println("");
        lineGenerator(20);
      }
      else if(i == 4 ){
        lineGenerator(20);
        System.out.println("");
        System.out.println("");
        System.out.println("Name: Coby");
        System.out.println("Age: 18");
        System.out.println("Likes: Playing video games, listening to music");
        System.out.println("Statement: ");
        System.out.println("I was gaming all day and didn't step foot outside t"
                           + "he house that day.");
        System.out.println("");
        System.out.println("");
        lineGenerator(20);
          }
      else if(i == 5){
        lineGenerator(20);
        System.out.println("");
        System.out.println("");
        System.out.println("Name: Daniel");
        System.out.println("Age: 18");
        System.out.println("Likes: Anime, going for long rides");
        System.out.println("Statement: ");
        System.out.println("I was in Santa Monica riding my bike along the coas"
                           + "t till' sundown.");
        System.out.println("");
        System.out.println("");
        lineGenerator(20);
      }
      else if(i == 0){
        System.out.println("Understood. Please stand by to await execution.");
        System.exit(0);
      }
      System.out.println("");

      int x = 0;
/* 'back' command breaks you out of the while loop to access the main hub of the
game */
      while(x < 1){
        System.out.print("Type 'back' to return to hub: ");
        String returnToHub = input.nextLine();
        if(returnToHub.equalsIgnoreCase("back")){
          x += 1;
        }
        else if(returnToHub.equalsIgnoreCase("exit program")){
          System.out.println("Understood. Please stand by to await execution.");
          System.exit(0);
        }
        else{
          System.out.println("Please enter a valid input: ");
        }
      }
      decisionPoint();
    }
  /* Method that contains the plot of the challenge, an option to go back to the
main hub, and option to exit the game with the 'exit program command' */
    public static void story(){
      Scanner input = new Scanner(System.in);
      lineGenerator(40);
      System.out.println("");
      System.out.println("A man was found dead in his office with several stab"
                         + "wounds.");
      System.out.println("The room was trashed, with papers and books on the fl"
                         + "oor, furniture sliced open, and broken pottery arou"
                         + "nd the office.");
      System.out.println("One object of interest was a calender on the man's "
                         + "desk.");
      System.out.println("The calender had bloody prints on three months; the 1"
                         + "2th month, the 4th month, and the 11th month.");
      System.out.println("It seems like the man intended to also mark some lett"
                         + "ers on some nearby newspaper judging from his blood"
                         + "y handprint on one, but died before he could.");
      System.out.println("");
      lineGenerator(40);
      System.out.println("");
      int i = 0;
      while(i < 1){
        System.out.println("Type 'back' to return to hub: ");
        String returnToHub2 = input.nextLine();
        if(returnToHub2.equalsIgnoreCase("back")){
          i += 1;
        }
        else if(returnToHub2.equalsIgnoreCase("exit program")){
          System.out.println("Understood. Please stand by to await execution.");
          System.exit(0);
        }
        else{
          System.out.println("Please enter a valid input: ");
        }
      }
      decisionPoint();
    }
/* This method gives you a prompt that asks you for your decision for who's the
murderer */
    public static void finalDecision(){
      Scanner input = new Scanner(System.in);

      int i = 0;
      while(i < 1){
        System.out.print("Who's the murderer?: ");
        String suspect = input.nextLine();
        if(suspect.equalsIgnoreCase("back")){
          i += 1;
        }
        else if(suspect.equalsIgnoreCase("exit program")){
          System.out.println("Understood. Please stand by to await execution.");
          System.exit(0);
        }
        else if(suspect.equalsIgnoreCase("Roger")){
          System.out.println("Incorrect. Please stand by to await execution");
          System.exit(0);
        }
        else if(suspect.equalsIgnoreCase("Ashley")){
          System.out.println("Not even close- immediate execution.");
          System.exit(0);
        }
        else if(suspect.equalsIgnoreCase("Deep")){
          System.out.println("Are you trying to lose? Doubt you even know what"
                             + " 'execution' means.");
          System.exit(0);
        }
        else if(suspect.equalsIgnoreCase("Coby")){
          System.out.println("Might as well let you go- at your cognitive level"
                             + " your bound to get yourself hit by a car");
          System.exit(0);
        }
  /* Daniel's the murderer, and if you guess right this else if statment
  take you to the second question of the second challenge.*/
        else if(suspect.equalsIgnoreCase("Daniel")){
          lineGenerator(20);
          System.out.println("");
          System.out.println("Correct. Next question.");
          i += 1;
          secondQuestion();
        }
        else if(suspect.equalsIgnoreCase("exit program")){
          System.out.println("Understood. Please stand by to await execution.");
          System.exit(0);
        }
        else{
          System.out.println("Please enter a valid command: ");
        }
    }
  }

/* This method shows the second question of the second challenge, which
is a memory game.*/
  public static void secondQuestion(){
    Scanner input = new Scanner(System.in);
    lineGenerator(20);
    System.out.println("");
    System.out.println("Second Question: ");
    System.out.println("");
    System.out.println("A series of numbers will be shown on the screen");
    System.out.println("These numbers will be in a 6 x 6 display.");
    System.out.println("Your goal is to memorize these numbers. Take as much ti"
                       + "me as you want, and remember that once you begin, the"
                       + "re's no going back");
    System.out.println("");
    lineGenerator(20);
    System.out.println("");
    int i = 0;
  /*This while loop breaks once you say yes or no to the prompt. */
    while(i < 1){
      System.out.println("Do you wish to start?: ");
      String decision = input.nextLine();
// Typing no quite the game.
      if(decision.equalsIgnoreCase("no")){
        System.out.println("Failure to comply results in immediate execution.");
        System.exit(0);
      }
  // Typing yes takes you to a method to show the numbers you need to memorize.
      else if(decision.equalsIgnoreCase("yes")){
        displaySecondQuestion();
        i += 1;
      }
  // typing anything else just runs the loop like normal.
      else{
        System.out.println("Please enter a valid input: ");
        lineGenerator(20);
      }

    }


  }
/* Method displays the 6x6 grid that contain random numbers
you need to memorize. */
  public static void displaySecondQuestion(){
    Scanner input = new Scanner(System.in);
  // This chunk contains an array that can hold 9 elements.
    Random rand = new Random();
    int[] randomArr = new int[9];
/* This for loop appends the array with random numbers from 1-10 that stops
up to the length of the array.*/
    for(int r = 0; r < randomArr.length; r++){
      randomArr[r] = rand.nextInt(11);
    }
  // This for loop serves to plot out the grid and numbers.
  lineGenerator(10);
  System.out.println("");
  for(int i = 0; i < 9; i++){
    if(i % 3 == 0 && i != 0){
      System.out.println("");
    }
    lineGeneratorVertical(1);
    System.out.print(randomArr[i]);
    lineGeneratorVertical(1);
  }
  System.out.println("");
  int y = 0;
/* while loop that keeps printing the prompt and input as long as
the input isn't yes or no. */
  while(y < 1){
    System.out.println("Are you ready?: ");
    String decision = input.nextLine();
    if(decision.equalsIgnoreCase("yes")){
      for(int x = 0; x < 50; x++){
        System.out.println(" ");
        y += 1;
      }
    }
    else if(decision.equalsIgnoreCase("no")){
      System.out.println("No compliance? Immediate execution.");
      System.exit(0);
    }
    else{
      System.out.println("Please enter a valid command: ");
    }
  }

  System.out.print("Please enter the numbers from top-down order: ");
/*Once you're ready, the program has you print out the numbers you've
memorize. If you get one wrong, then you lose the game. If you guess all
correctly, then you progress to the final question of the second challenge.
*/
  for(int l = 0; l < randomArr.length; l++){
    System.out.print("Input number: ");
    int memory = input.nextInt();
    if(memory != randomArr[l]){
      System.out.println("Your memory blows! Immediate execution!");
      System.exit(0);
    }
    else{
      System.out.println("Correct!");
      System.out.println("");
      lineGenerator(10);
    }
  }
  System.out.println("\nNot bad. Onto the final question!");
  lineGenerator(20);
  thirdQuestion();
  }

/* spaceGenerator method is a useful tool which prints out spaces horizontally.
you can also specify how many spaces you want as a parameter.*/
  public static void spaceGenerator(int units){
    for(int i = 0; i < units; i++){
      System.out.print(" ");
    }
  }

// This method contains the third question, which are math problems.
  public static void thirdQuestion(){
  Scanner input = new Scanner(System.in);
  int i = 0;
  lineGenerator(20);
// Explanation of the prompt.
  System.out.println("");
  System.out.println("Third Question: ");
  System.out.println("This question is broken into three parts, each containing"
                     + "math problems.");
  System.out.println("These questions can only be solved by the top 10% brass o"
                     + "f the world.");
  lineGenerator(20);
/* while loop keeps printing out prompt asking whether you wish to start the
game as long as input isn't yes or no.*/
  while(i < 1){
    System.out.println("\nDo you wish to start?: ");
    String decision = input.nextLine();
/* if no then the entire game ends. */
    if(decision.equalsIgnoreCase("no")){
      System.out.println("Failure to comply results in immediate execution.");
      System.exit(0);
    }
// if yes then a method that prints the question prompts and inputs out.
    else if(decision.equalsIgnoreCase("yes")){
      displayThirdQuestion();
    }
    else{
      System.out.println("Please enter a valid input.");
      lineGenerator(20);
    }

  }
  }
/* method displayThirdQuestion shows the math questions.
First two questions are CS math questions. The final question is
an integral problem.*/
  public static void displayThirdQuestion(){
    Scanner input = new Scanner(System.in);
    lineGenerator(20);
    System.out.println("");
    System.out.println("Part A. ");
    System.out.println("");
    System.out.println("Find the two's complement of the sum of numbers 144 and"
                       + " 25 in decimal form: ");
    int questionA = input.nextInt();
    if(questionA == 87){
      System.out.println("Correct.");
    }
    else{
      System.out.println("Incorrect. Guards will now escort you our of the faci"
                         + "lity.");
      System.exit(0);
    }
    lineGenerator(20);
    System.out.println("");
    System.out.println("Part B. ");
    System.out.println("");
    System.out.println("Convert your answer from your previous question into a "
                       + "hexadecimal: ");
    int questionB = input.nextInt();
    if(questionB == 57){
      System.out.println("Correct.");
    }
    else{
      System.out.println("Incorrect. Guards will now escort you our of the faci"
                         + "lity.");
      System.exit(0);
    }
    /* 1053 to 1060 is the prompt for Part C of the third question of the second
       challenge. */
    lineGenerator(20);
    System.out.println("");
    System.out.println("Part C. ");
    System.out.println("");
    System.out.println("Please write your answer as a whole number.");
    System.out.print("Whats the integral of 24x^3 + ln(24x^2) - 5 from bound 3"
                      + " to 5: ");
    int questionC = input.nextInt();
/* Once the final question is answered correctly, the ontoFinalQuestion method
is called that leads you to a checkpoint that takes you to the final
question.*/
    if(questionC == 19){
      System.out.println("Correct");
      System.out.println("You have completed this challenge. Please continue to "
                         + "the third and final room");
      ontoFinalQuestion();
    }
    else{
      System.out.println("Incorrect. Guards will now escort you out of the "
      + "facility.");
      System.exit(0);
    }
  }
  /* Method asks you if you want to continue to the last question.
  Answering no terminates the program, while typing nonsense just restates
  the prompt. */
  public static void ontoFinalQuestion(){
      Scanner input = new Scanner(System.in);
      int j = 0;
      while(j == 0){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         + "~~~~~~~");
        System.out.println("Continue to the last question? ");

        String ontoThirdQuestion = input.nextLine();
        if(ontoThirdQuestion.equalsIgnoreCase("yes")){
          j += 1;
          unlock();
        }
        else if(ontoThirdQuestion.equalsIgnoreCase("no")){
          System.out.println("Understood. Stand by for immediate execution.");
          System.exit(0);
        }
        else{
          System.out.println("Please input a valid command.");
        }
      }
    }



//This is the end of the main public class
}
