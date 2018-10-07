package fj.data;

import fj.F0;
import fj.F2;
import org.derive4j.Data;
import org.derive4j.FieldNames;
import org.derive4j.Flavour;

@Data(flavour = Flavour.FJ)
public abstract class LazyList2<A> {

  interface Cases<A, X> {
    X nil();
    X cons(A head, LazyList2<A> tail);
  }

  public abstract <X> X list(Cases<A, X> cases);

}
