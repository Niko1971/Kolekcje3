package kolekcje3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Kolekcje3 {

    public static void wstawianiePoczatek(long czas) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        long rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            arrayList.add(0, "TEST");
        }
        long koniec = System.nanoTime();
        long roznica1 = (koniec - rozpoczecie);
        rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            linkedList.add(0, "TEST");
        }
        koniec = System.nanoTime();
        long roznica2 = (koniec - rozpoczecie);
        if (roznica1 == roznica2) {
            System.out.println("Wstawianie Poczatek: czas rowny");
        } else if (roznica1 > roznica2) {
            System.out.println("Wstawianie Poczatek: LinkedLista jest szybsza");
        } else {
            System.out.println("Wstawianie Poczatek: ArrayLista jest szybsza");
        }
    }

    public static void wstawianieSrodek(long czas) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        long rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            arrayList.add((arrayList.size() / 2), "TEST");
        }
        long koniec = System.nanoTime();
        long roznica1 = (koniec - rozpoczecie);
        rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            linkedList.add((linkedList.size() / 2), "TEST");
        }
        koniec = System.nanoTime();
        long roznica2 = (koniec - rozpoczecie);
        if (roznica1 == roznica2) {
            System.out.println("Wstawianie Srodek: czas rowny");
        } else if (roznica1 > roznica2) {
            System.out.println("Wstawianie Srodek: LinkedLista jest szybsza");
        } else {
            System.out.println("Wstawianie Srodek: ArrayLista jest szybsza");
        }
    }

    public static void wstawianieKoniec(long czas) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        long rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            linkedList.add("TEST");
        }
        long koniec = System.nanoTime();
        long roznica1 = (koniec - rozpoczecie);
        rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            linkedList.add("TEST");
        }
        koniec = System.nanoTime();
        long roznica2 = (koniec - rozpoczecie);
        if (roznica1 == roznica2) {
            System.out.println("Wstawianie Koniec: czas rowny");
        } else if (roznica1 > roznica2) {
            System.out.println("Wstawianie Koniec: LinkedLista jest szybsza");
        } else {
            System.out.println("Wstawianie Koniec: ArrayLista jest szybsza");
        }
    }

    public static void usuwaniePoczatek(long czas) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        for (long a = 0; a < czas; a++) {
            arrayList.add("TEST");
            linkedList.add("TEST");
        }
        long rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            arrayList.remove(0);
        }
        long koniec = System.nanoTime();
        long roznica1 = (koniec - rozpoczecie);
        rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            linkedList.remove(0);
        }
        koniec = System.nanoTime();
        long roznica2 = (koniec - rozpoczecie);
        if (roznica1 == roznica2) {
            System.out.println("Usuwanie Poczatek: czas rowny");
        } else if (roznica1 > roznica2) {
            System.out.println("Usuwanie Poczatek: LinkedLista jest szybsza");
        } else {
            System.out.println("Usuwanie Poczatek: ArrayLista jest szybsza");
        }
    }

    public static void usuwanieSrodek(long czas) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        for (long i = 0; i < czas; i++) {
            arrayList.add("TEST");
            linkedList.add("TEST");
        }
        long rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            arrayList.remove((arrayList.size() / 2));
        }
        long koniec = System.nanoTime();
        long roznica1 = (koniec - rozpoczecie);
        rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            linkedList.remove((linkedList.size() / 2));
        }
        koniec = System.nanoTime();
        long roznica2 = (koniec - rozpoczecie);
        if (roznica1 == roznica2) {
            System.out.println("Usuwanie Srodek: czas rowny");
        } else if (roznica1 > roznica2) {
            System.out.println("Usuwanie Srodek: LinkedLista jest szybsza");
        } else {
            System.out.println("Usuwanie Srodek: ArrayLista jest szybsza");
        }
    }

    public static void usuwanieKoniec(long czas) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        for (long a = 0; a < czas; a++) {
            arrayList.add("TEST");
            linkedList.add("TEST");
        }
        long rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            arrayList.remove(arrayList.size() - 1);
        }
        long koniec = System.nanoTime();
        long roznica1 = (koniec - rozpoczecie);
        rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            linkedList.remove(linkedList.size() - 1);
        }
        koniec = System.nanoTime();
        long roznica2 = (koniec - rozpoczecie);
        if (roznica1 == roznica2) {
            System.out.println("Usuwanie Koniec: czas rowny");
        } else if (roznica1 > roznica2) {
            System.out.println("Usuwanie Koniec: LinkedLista jest szybsza");
        } else {
            System.out.println("Usuwanie Koniec: ArrayLista jest szybsza");
        }
    }

    public static void zwroceniePoczatek(long czas) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        for (long a = 0; a < czas; a++) {
            arrayList.add("TEST");
            linkedList.add("TEST");
        }
        long rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            arrayList.get(0);
        }
        long koniec = System.nanoTime();
        long roznica1 = (koniec - rozpoczecie);
        rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            linkedList.get(0);
        }
        koniec = System.nanoTime();
        long roznica2 = (koniec - rozpoczecie);
        if (roznica1 == roznica2) {
            System.out.println("Zwrocenie Poczatek: czas rowny");
        } else if (roznica1 > roznica2) {
            System.out.println("Zwrocenie Poczatek: LinkedLista jest szybsza");
        } else {
            System.out.println("Zwrocenie Poczatek: ArrayLista jest szybsza");
        }
    }

    public static void zwrocenieSrodek(long czas) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        for (long a = 0; a < czas; a++) {
            arrayList.add("TEST");
            linkedList.add("TEST");
        }
        long rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            arrayList.get((arrayList.size() / 2));
        }
        long koniec = System.nanoTime();
        long roznica1 = (koniec - rozpoczecie);
        rozpoczecie = System.nanoTime();
        for (long i = 0; i < czas; i++) {
            linkedList.get((linkedList.size() / 2));
        }
        koniec = System.nanoTime();
        long roznica2 = (koniec - rozpoczecie);
        if (roznica1 == roznica2) {
            System.out.println("Zwrocenie Srodek: czas rowny");
        } else if (roznica1 > roznica2) {
            System.out.println("Zwrocenie Srodek: LinkedLista jest szybsza");
        } else {
            System.out.println("Zwrocenie Srodek: ArrayLista jest szybsza");
        }
    }

    public static void zwrocenieKoniec(long czas) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        for (long a = 0; a < czas; a++) {
            arrayList.add("TEST");
            linkedList.add("TEST");
        }
        long rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            arrayList.get(arrayList.size() - 1);
        }
        long koniec = System.nanoTime();
        long roznica1 = (koniec - rozpoczecie);
        rozpoczecie = System.nanoTime();
        for (long a = 0; a < czas; a++) {
            linkedList.get(linkedList.size() - 1);
        }
        koniec = System.nanoTime();
        long roznica2 = (koniec - rozpoczecie);
        if (roznica1 == roznica2) {
            System.out.println("Zwrocenie Koniec: czas rowny");
        } else if (roznica1 > roznica2) {
            System.out.println("Zwrocenie Koniec: LinkedLista jest szybsza");
        } else {
            System.out.println("Zwrocenie Koniec: ArrayLista jest szybsza");
        }
    }

    public static void main(String[] args) {
        long czas = 100000;
        wstawianiePoczatek(czas);
        wstawianieSrodek(czas);
        wstawianieKoniec(czas);
        usuwaniePoczatek(czas);
        usuwanieSrodek(czas);
        usuwanieKoniec(czas);
        zwroceniePoczatek(czas);
        zwrocenieSrodek(czas);
        zwrocenieKoniec(czas);
    }
}
