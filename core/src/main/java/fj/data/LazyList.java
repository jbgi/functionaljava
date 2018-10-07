package fj.data;

import fj.F0;
import fj.F2;
import org.derive4j.Data;
import org.derive4j.FieldNames;
import org.derive4j.Flavour;

@Data(flavour = Flavour.FJ)
public interface LazyList<A> {

  <X> X list(F0<X> nil, @FieldNames({ "head", "tail" }) F2<A, LazyList<A>, X> cons);

}
