import actor.FirstActor;
import actor.SecondActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;

public class App {

    public static void main(String[] args) {





        ActorSystem akkaSystem=ActorSystem.create("system");
        ActorRef firstActor = akkaSystem.actorOf(FirstActor.props(),"FirstActor");
        ActorRef secondActor = akkaSystem.actorOf(SecondActor.props(),"SecondActor");

        firstActor.tell("Started",ActorRef.noSender());


        //System.out.println(secondActor.path());










    }


}
