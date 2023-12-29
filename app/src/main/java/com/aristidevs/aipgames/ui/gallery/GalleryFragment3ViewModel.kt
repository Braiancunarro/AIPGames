package com.aristidevs.aipgames.ui.gallery

import androidx.lifecycle.ViewModel

class GalleryFragment3ViewModel : ViewModel() {
    fun Caranta(
        c: String,
        a: String,
        r: String,
        a2: String,
        n: String,
        t: String,
        a3: String
    ): Boolean {
        return c.equals("C", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true) &&
                n.equals("N", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                a3.equals("A", ignoreCase = true)
    }

    fun Ibarra(i: String, b: String, a: String, r: String, r2: String, a2: String): Boolean {
        return i.equals("I", ignoreCase = true) &&
                b.equals("B", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                r2.equals("R", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true)
    }

    fun Diaz(d: String, i: String, a: String, z: String): Boolean {
        return d.equals("D", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                z.equals("Z", ignoreCase = true)
    }

    fun RodriguezM(m:String, o1:String, r3:String, e1:String, l:String,
        r: String,
        o: String,
        d: String,
        r2: String,
        i: String,
        g: String,
        u: String,
        e: String,
        z: String
    ): Boolean {
        return m.equals("M", ignoreCase = true)&&
                o1.equals("O", ignoreCase = true)&&
                r3.equals("R", ignoreCase = true)&&
                e1.equals("E", ignoreCase = true)&&
                l.equals("L", ignoreCase = true)&&
                r.equals("R", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                d.equals("D", ignoreCase = true) &&
                r2.equals("R", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                g.equals("G", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                z.equals("Z", ignoreCase = true)

    }

    fun RodriguezC(
        c: String, l: String, e: String, m: String, e2: String, n: String, t: String, e3: String,
        r: String,
        o: String,
        d: String,
        r2: String,
        i: String,
        g: String,
        u: String,
        e4: String,
        z: String
    ): Boolean {
        return c.equals("C", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                m.equals("M", ignoreCase = true) &&
                e2.equals("E", ignoreCase = true) &&
                n.equals("N", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                d.equals("D", ignoreCase = true) &&
                r2.equals("R", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                g.equals("G", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                e4.equals("E", ignoreCase = true) &&
                z.equals("Z", ignoreCase = true)
    }

    fun Ledesma(
        l: String,
        e: String,
        d: String,
        e2: String,
        s: String,
        m: String,
        a: String
    ): Boolean {
        return l.equals("L", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                d.equals("D", ignoreCase = true) &&
                e2.equals("E", ignoreCase = true) &&
                s.equals("S", ignoreCase = true) &&
                m.equals("M", ignoreCase = true) &&
                a.equals("A", ignoreCase = true)
    }

    fun Banega(b: String, a: String, n: String, e: String, g: String, a2: String): Boolean {
        return b.equals("B", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                n.equals("N", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                g.equals("G", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true)
    }

    fun Cardozo(
        c: String,
        a: String,
        r: String,
        d: String,
        o: String,
        z: String,
        o2: String
    ): Boolean {
        return c.equals("C", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                d.equals("D", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                z.equals("Z", ignoreCase = true) &&
                o2.equals("O", ignoreCase = true)
    }

    fun Riquelme(
        r: String,
        i: String,
        q: String,
        u: String,
        e: String,
        l: String,
        m: String,
        e2: String
    ): Boolean {
        return r.equals("R", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                q.equals("Q", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                m.equals("M", ignoreCase = true) &&
                e2.equals("E", ignoreCase = true)
    }

    fun Palacio(
        p: String,
        a: String,
        l: String,
        a2: String,
        c: String,
        i: String,
        o: String
    ): Boolean {
        return p.equals("P", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true) &&
                c.equals("C", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                o.equals("O", ignoreCase = true)
    }

    fun Palermo(
        p: String,
        a: String,
        l: String,
        e: String,
        r: String,
        m: String,
        o: String
    ): Boolean {
        return p.equals("P", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                m.equals("M", ignoreCase = true) &&
                o.equals("O", ignoreCase = true)
    }
}