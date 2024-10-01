package com.ipartek.herencia;

public interface IUna extends IDos, ITres {

    //En Java existe la herencia múltiple entre interfaces
    //Una interface puede extender múltiples interfaces
    //Sin embargo la herencia múltiple de clases no existe en Java
    void metodoIUna1();
    void metodoIUna2();
}
