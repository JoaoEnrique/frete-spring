package br.com.fatec.frete.repository.adapter;

import br.com.fatec.frete.entity.Frete;
import br.com.fatec.frete.repository.orm.FreteOrm;

public class FreteRepositoryAdapter {
    private FreteRepositoryAdapter() {
    }

    public static FreteOrm cast(Frete frete) {
        return new FreteOrm(
                frete.id(),
                frete.idUser(),
                frete.status(),
                frete.valor()
        );
    }

    public static Frete cast(FreteOrm orm) {
        return new Frete(
                orm.id(),
                orm.idUser(),
                orm.status(),
                orm.valor()
        );
    }
}
