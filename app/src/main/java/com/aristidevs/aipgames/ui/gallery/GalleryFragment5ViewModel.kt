package com.aristidevs.aipgames.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.aristidevs.aipgames.ui.slideshow.Jugadores

class GalleryFragment5ViewModel : ViewModel(){

    fun Campana(c: String, a: String, m: String, p: String, a2: String, n: String, a3: String): Boolean {
        return c.equals("C", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                m.equals("M", ignoreCase = true) &&
                p.equals("P", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true) &&
                n.equals("Ñ", ignoreCase = true) &&
                a3.equals("A", ignoreCase = true)
    }

    fun Bustos(b: String, u: String, s: String, t: String, o: String, s2: String): Boolean {
        return b.equals("B", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                s.equals("S", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                s2.equals("S", ignoreCase = true)
    }

    fun Franco(f: String, r: String, a: String, n: String, c: String, o: String): Boolean {
        return f.equals("F", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                n.equals("N", ignoreCase = true) &&
                c.equals("C", ignoreCase = true) &&
                o.equals("O", ignoreCase = true)
    }

    fun Silva(s: String, i: String, l: String, v: String, a: String): Boolean {
        return s.equals("S", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                v.equals("V", ignoreCase = true) &&
                a.equals("A", ignoreCase = true)
    }

    fun Tagliafico(t: String, a: String, g: String, l: String, i: String, a2: String, f: String, i2: String, c: String, o: String): Boolean {
        return t.equals("T", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                g.equals("G", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                a2.equals("A", ignoreCase = true) &&
                f.equals("F", ignoreCase = true) &&
                i2.equals("I", ignoreCase = true) &&
                c.equals("C", ignoreCase = true) &&
                o.equals("O", ignoreCase = true)
    }

    fun Rodriguez(r: String, o: String, d: String, r2: String, i: String, g: String, u: String, e: String, z: String): Boolean {
        return r.equals("R", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                d.equals("D", ignoreCase = true) &&
                r2.equals("R", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                g.equals("G", ignoreCase = true) &&
                u.equals("U", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                z.equals("Z", ignoreCase = true)
    }

    fun SanchezMino(s: String, a: String, n: String, c: String, h: String, e: String, z: String, m: String, i: String, n2: String, o: String): Boolean {
        return s.equals("S", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                n.equals("N", ignoreCase = true) &&
                c.equals("C", ignoreCase = true) &&
                h.equals("H", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                z.equals("Z", ignoreCase = true) &&
                m.equals("M", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                n2.equals("Ñ", ignoreCase = true) &&
                o.equals("O", ignoreCase = true)
    }

    fun Meza(m: String, e: String, z: String, a: String): Boolean {
        return m.equals("M", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                z.equals("Z", ignoreCase = true) &&
                a.equals("A", ignoreCase = true)
    }

    fun Barco(b: String, a: String, r: String, c: String, o: String): Boolean {
        return b.equals("B", ignoreCase = true) &&
                a.equals("A", ignoreCase = true) &&
                r.equals("R", ignoreCase = true) &&
                c.equals("C", ignoreCase = true) &&
                o.equals("O", ignoreCase = true)
    }

    fun Benitez(b: String, e: String, n: String, i: String, t: String, e2: String, z: String): Boolean {
        return b.equals("B", ignoreCase = true) &&
                e.equals("E", ignoreCase = true) &&
                n.equals("N", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                e2.equals("E", ignoreCase = true) &&
                z.equals("Z", ignoreCase = true)
    }

    fun Gigliotti(g: String, i: String, g2: String, l: String, i2: String, o: String, t: String, t2: String, i3: String): Boolean {
        return g.equals("G", ignoreCase = true) &&
                i.equals("I", ignoreCase = true) &&
                g2.equals("G", ignoreCase = true) &&
                l.equals("L", ignoreCase = true) &&
                i2.equals("I", ignoreCase = true) &&
                o.equals("O", ignoreCase = true) &&
                t.equals("T", ignoreCase = true) &&
                t2.equals("T", ignoreCase = true) &&
                i3.equals("I", ignoreCase = true)
    }
}