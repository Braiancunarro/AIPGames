package com.aristidevs.aipgames.ui.slideshow

import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {
    fun Hart(h: String, a: String, r: String, t: String): Boolean {
        return h.equals("H", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                t.equals("T", ignoreCase = true)
    }
    fun Zabaleta(z: String, a: String, b: String, a2: String, l: String, e: String, t: String, a3: String): Boolean {
        return z.equals("Z", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                b.equals("B", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                a3.equals("A", ignoreCase = true)
    }
    fun Kompany(k: String, o: String, m: String, p: String, a: String, n: String, y: String): Boolean {
        return k.equals("K", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                m.equals("M", ignoreCase = true) &&
                p.equals("P", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                n.equals("N", ignoreCase = true) &&
                y.equals("Y", ignoreCase = true)
    }
    fun Lescott(l: String, e: String, s: String, c: String, o: String, t: String, t2: String): Boolean {
        return l.equals("L", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                s.equals("S", ignoreCase = true) &&
                c.equals("C", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                t2.equals("T", ignoreCase = true)
    }
    fun Clichy(c: String, l: String, i: String, c2: String, h: String, y: String): Boolean {
        return c.equals("C", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                c2.equals("C", ignoreCase = true) &&
                h.equals("H", ignoreCase = true) &&
                y.equals("Y", ignoreCase = true)
    }
    fun Nasri(n: String, a: String, s: String, r: String, i: String): Boolean {
        return n.equals("N", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                s.equals("S", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                i.equals("I", ignoreCase = true)
    }
    fun Toure(t: String, o: String, u: String, r: String, e: String): Boolean {
        return t.equals("T", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                e.equals("E", ignoreCase = true)
    }
    fun Barry(b: String, a: String, r: String, r2: String, y: String): Boolean {
        return b.equals("B", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                r2.equals("R", ignoreCase = true) &&
                y.equals("Y", ignoreCase = true)
    }
    fun Silva(s: String, i: String, l: String, v: String, a: String): Boolean {
        return s.equals("S", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                v.equals("V", ignoreCase = true) &&
                a.equals("A", ignoreCase = true)
    }
    fun Tevez(t: String, e: String, v: String, e2: String, z: String): Boolean {
        return t.equals("T", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                v.equals("V", ignoreCase = true) &&
                e2.equals("E", ignoreCase = true) &&
                z.equals("Z", ignoreCase = true)
    }

    fun Aguero(a: String, g: String, u: String, e: String, r: String, o: String): Boolean {
        return a.equals("A", ignoreCase = true) &&
                g.equals("G", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                o.equals("O", ignoreCase = true)
    }




}