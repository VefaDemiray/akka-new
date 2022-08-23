package actor;
import akka.actor.AbstractActor;
import akka.actor.ActorSelection;
import akka.actor.Props;
import akka.japi.pf.ReceiveBuilder;

public class FirstActor extends AbstractActor{

    public void containter(String msg){

        System.out.println("Hi from FirstActor " + msg) ;
        SecondActor.tell("Hi from first actor",self());

    }


    ActorSelection SecondActor=getContext().actorSelection("akka://system/user/SecondActor");




    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(String.class,msg->containter(msg))

                .build();
    }

    public static Props props(){
       return Props.create(FirstActor.class);
    }


}
