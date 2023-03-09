package com.megabankcorp.system;

/* Представим, что вы занимаетесь проектированием банковской системы учета.
Ваша задача описать базовые классы, на основании которых могут делаться остальные.
Спроектируйте классы Account (счет) и Database (база данных) согласно описанию:

Database
    Этот класс является абстрактным шаблоном для реализаций,
    которые будут создаваться в виде наследников этого класса.
    В нем находятся методы, которые наследники обязаны реализовать.
    Или реализации методов по-умолчанию.
    Вам наследников реализовывать не надо.

    находится в пакете com.megabankcorp.system
    содержит заготовки методов
        - deposit - сохраняет указанную сумму на указанный счет
            не содержит реализации, просто сигнатура с описанием
            доступен отовсюду

        - withdraw - снимает указанную сумму с указанного счета
            не содержит реализации, просто сигнатура с описанием
            доступен отовсюду

        - getAmount - получает значение суммы с указанного счета
            не содержит реализации, просто сигнатура с описанием
            доступен только из пакета и реализаций

        - transfer - передает указанную сумму с одного указанного счета на другой
            содержит реализацию по умолчанию, использующую методы deposit и withdraw
            доступен только из пакета

    Для суммы используйте тип BigDecimal.
    Для параметров счетов используете класс Account

Account
    это простой класс, который находится в пакете com.megabankcorp.records
    содержит
        поле для текущей суммы на счете
        поле для текущего номера счета
        поле для номера клиента банка

    Для суммы используйте тип BigDecimal, для номеров - long*/

public class Database {

    void deposit() {

    }

    void withdraw() {

    }

    void getAmount() {

    }

    void transfer() {

    }
}
