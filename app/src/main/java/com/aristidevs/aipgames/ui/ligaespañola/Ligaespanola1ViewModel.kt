package com.aristidevs.aipgames.ui.ligaespañola

import androidx.lifecycle.ViewModel

class Ligaespanola1ViewModel : ViewModel() {

    fun Valdes(v: String, a: String, l: String, d: String, e: String, s: String): Boolean {
        return v.equals("V", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                d.equals("D", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                s.equals("S", ignoreCase = true)
    }

    fun Alves(a: String, l: String, v: String, e: String, s: String): Boolean {
        return a.equals("A", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                v.equals("V", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                s.equals("S", ignoreCase = true)
    }

    fun Pique(p: String, i: String, q: String, u: String, e: String): Boolean {
        return p.equals("P", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                q.equals("Q", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                e.equals("E", ignoreCase = true)
    }

    fun Mascherano(m: String, a: String, s: String, c: String, h: String, e: String, r: String, a2: String, n: String, o: String): Boolean {
        return m.equals("M", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                s.equals("S", ignoreCase = true) &&
                c.equals("C", ignoreCase = true) &&
                h.equals("H", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true) &&
                n.equals("N", ignoreCase = true) &&
                o.equals("O", ignoreCase = true)
    }

    fun Alba(a: String, l: String, b: String, a2: String): Boolean {
        return a.equals("A", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                b.equals("B", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true)
    }

    fun Xavi(x: String, a: String, v: String, i: String): Boolean {
        return x.equals("X", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                v.equals("V", ignoreCase = true) &&
                i.equals("I", ignoreCase = true)
    }

    fun Busquets(b: String, u: String, s: String, q: String, u2: String, e: String, t: String, s2: String): Boolean {
        return b.equals("B", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                s.equals("S", ignoreCase = true) &&
                q.equals("Q", ignoreCase = true) &&
                u2.equals("U", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                s2.equals("S", ignoreCase = true)
    }

    fun Fabregas(f: String, a: String, b: String, r: String, e: String, g: String, a2: String, s: String): Boolean {
        return f.equals("F", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                b.equals("B", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                g.equals("G", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true) &&
                s.equals("S", ignoreCase = true)
    }

    fun Iniesta(i: String, n: String, i2: String, e: String, s: String, t: String, a: String): Boolean {
        return i.equals("I", ignoreCase = true) &&
                n.equals("N", ignoreCase = true) &&
                i2.equals("I", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                s.equals("S", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                a.equals("A", ignoreCase = true)
    }

    fun Neymar(n: String, e: String, y: String, m: String, a: String, r: String): Boolean {
        return n.equals("N", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                y.equals("Y", ignoreCase = true) &&
                m.equals("M", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                r.equals("R", ignoreCase = true)
    }

    fun Messi(m: String, e: String, s: String, s2: String, i: String): Boolean {
        return m.equals("M", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                s.equals("S", ignoreCase = true) &&
                s2.equals("S", ignoreCase = true) &&
                i.equals("I", ignoreCase = true)
    }

}