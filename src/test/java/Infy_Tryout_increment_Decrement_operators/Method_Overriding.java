package Infy_Tryout_increment_Decrement_operators;

//Parent class: EventRegistration
class EventRegistration {
 private String name;
 private String eventName;
 protected double registrationFee;

 // Constructor
 public EventRegistration(String name, String eventName) {
     this.name = name;
     this.eventName = eventName;
 }

 // Method to register for an event
 public void registerEvent() {
     System.out.println("Event Registration successful.");
 }

 // Getter for registration fee
 public double getRegistrationFee() {
     return registrationFee;
 }

 // Getter for event name
 public String getEventName() {
     return eventName;
 }

 // Getter for participant name
 public String getName() {
     return name;
 }
}

//Subclass: SingleEventRegistration
class SingleEventRegistration extends EventRegistration {
 private static final double SHAKALOG_FEE = 100.0;
 private static final double SING_AND_WIN_FEE = 150.0;
 private static final double PLAY_AWAY_FEE = 130.0;

 // Constructor
 public SingleEventRegistration(String name, String eventName) {
     super(name, eventName);
 }

 @Override
 public void registerEvent() {
     switch (super.getEventName()) {
         case "ShakeALog":
             registrationFee = SHAKALOG_FEE;
             break;
         case "Sing&Win":
             registrationFee = SING_AND_WIN_FEE;
             break;
         case "PlayAway":
             registrationFee = PLAY_AWAY_FEE;
             break;
         default:
             System.out.println("Invalid event name for single registration.");
             return;
     }
     System.out.println("Participant: " + super.getName());
     System.out.println("Event: " + super.getEventName());
     System.out.println("Registration Fee: $" + registrationFee);
 }
}

//Subclass: TeamEventRegistration
class TeamEventRegistration extends EventRegistration {
 private int noOfParticipants;
 private static final double TEAM_BASE_FEE = 50.0;

 // Constructor
 public TeamEventRegistration(String name, String eventName, int noOfParticipants) {
     super(name, eventName);
     this.noOfParticipants = noOfParticipants;
 }

 @Override
 public void registerEvent() {
     registrationFee = noOfParticipants * TEAM_BASE_FEE;
     System.out.println("Team Name: " + super.getName());
     System.out.println("Event: " + super.getEventName());
     System.out.println("Number of Participants: " + noOfParticipants);
     System.out.println("Registration Fee: $" + registrationFee);
 }
}

//Tester Class
public class Method_Overriding {
 public static void main(String[] args) {
     // Single Event Registration
     SingleEventRegistration singleEvent = new SingleEventRegistration("Alice", "Sing&Win");
     singleEvent.registerEvent();

     System.out.println();
     
     // Team Event Registration
     TeamEventRegistration teamEvent = new TeamEventRegistration("Team Aces", "ShakeALog", 5);
     teamEvent.registerEvent();
 }
}