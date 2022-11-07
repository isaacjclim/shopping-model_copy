package shopping.modelcopy.domain;

import shopping.modelcopy.domain.*;
import shopping.modelcopy.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ProductRegistered extends AbstractEvent {

    private Long id;
    private String name;
    private Long qty;

    public ProductRegistered(Product aggregate){
        super(aggregate);
    }
    public ProductRegistered(){
        super();
    }
}
