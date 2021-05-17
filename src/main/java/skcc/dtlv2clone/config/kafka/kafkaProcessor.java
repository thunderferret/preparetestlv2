package skcc.dtlv2clone.config.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface kafkaProcessor {


        String INPUT = "event-in";
        String OUTPUT = "event-out";

        @Input(INPUT)
        SubscribableChannel inboundTopic();

        @Output(OUTPUT)
        MessageChannel outboundTopic();

}
