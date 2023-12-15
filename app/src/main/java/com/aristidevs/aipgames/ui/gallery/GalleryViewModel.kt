package com.aristidevs.aipgames.ui.gallery

import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    fun Saja(s: String, a1: String, j: String, a2: String): Boolean {
        return s.equals("S", ignoreCase = true) &&
                a1.equals("A", ignoreCase = true) &&
                j.equals("J", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true)
    }

    fun Pillud(p: String, i: String, l1: String, l2: String, u: String, d: String): Boolean {
        return p.equals("P", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                l1.equals("L", ignoreCase = true) &&
                l2.equals("L", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                d.equals("D", ignoreCase = true)
    }

    fun Lollo(l1: String, o1: String, l2: String, l3: String, o2: String): Boolean {
        return l1.equals("L", ignoreCase = true) &&
                o1.equals("O", ignoreCase = true) &&
                l2.equals("L", ignoreCase = true) &&
                l3.equals("L", ignoreCase = true) &&
                o2.equals("O", ignoreCase = true)
    }

    fun Cabral(c: String, a1: String, b: String, r: String, a2: String,l: String): Boolean {
        return c.equals("C", ignoreCase = true) &&
                a1.equals("A", ignoreCase = true) &&
                b.equals("B", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true) &&
                l.equals("L", ignoreCase = true)
    }
    fun Grimi(g: String, r: String, i1: String, m: String, i2: String): Boolean {
        return g.equals("G", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                i1.equals("I", ignoreCase = true) &&
                m.equals("M", ignoreCase = true) &&
                i2.equals("I", ignoreCase = true)
    }

    fun Videla(v: String, i: String, d: String, e: String, l: String, a: String): Boolean {
        return v.equals("V", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                d.equals("D", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                a.equals("A", ignoreCase = true)
    }

    fun Aued(a: String, u: String, e: String, d: String): Boolean {
        return a.equals("A", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                d.equals("D", ignoreCase = true)
    }

    fun Diaz(d: String, i: String, a: String, z: String): Boolean {
        return d.equals("D", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                z.equals("Z", ignoreCase = true)
    }

    fun Centurion(c: String, e: String, n1: String, t: String, u: String, r: String, i:String, o:String, n2:String): Boolean {
        return c.equals("C", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                n1.equals("N", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                n2.equals("N", ignoreCase = true)
    }

    fun Bou(b: String, o: String, u: String): Boolean {
        return b.equals("B", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                u.equals("U", ignoreCase = true)
    }

    fun Milito(m: String, i1: String, l: String, i2: String, t: String, o: String): Boolean {
        return m.equals("M", ignoreCase = true) &&
                i1.equals("I", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                i2.equals("I", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                o.equals("O", ignoreCase = true)
    }
}



