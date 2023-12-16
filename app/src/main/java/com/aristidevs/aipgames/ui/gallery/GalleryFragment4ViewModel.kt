package com.aristidevs.aipgames.ui.gallery

import androidx.lifecycle.ViewModel

class GalleryFragment4ViewModel : ViewModel() {
        fun Torrico(
            t: String,
            o: String,
            r: String,
            r2: String,
            i: String,
            c: String,
            o2: String
        ): Boolean {
            return t.equals("T", ignoreCase = true) &&
                    o.equals("O", ignoreCase = true) &&
                    r.equals("R", ignoreCase = true) &&
                    r2.equals("R", ignoreCase = true) &&
                    i.equals("I", ignoreCase = true) &&
                    c.equals("C", ignoreCase = true) &&
                    o2.equals("O", ignoreCase = true)
        }

        fun Buffarini(
            b: String,
            u: String,
            f: String,
            f2: String,
            a: String,
            r: String,
            i: String,
            n: String,
            i2: String
        ): Boolean {
            return b.equals("B", ignoreCase = true) &&
                    u.equals("U", ignoreCase = true) &&
                    f.equals("F", ignoreCase = true) &&
                    f2.equals("F", ignoreCase = true) &&
                    a.equals("A", ignoreCase = true) &&
                    r.equals("R", ignoreCase = true) &&
                    i.equals("I", ignoreCase = true) &&
                    n.equals("N", ignoreCase = true) &&
                    i2.equals("I", ignoreCase = true)
        }

        fun Fontanini(
            f: String,
            o: String,
            n: String,
            t: String,
            a: String,
            n2: String,
            i1: String,
            n3: String,
            i2: String
        ): Boolean {
            return f.equals("F", ignoreCase = true) &&
                    o.equals("O", ignoreCase = true) &&
                    n.equals("N", ignoreCase = true) &&
                    t.equals("T", ignoreCase = true) &&
                    a.equals("A", ignoreCase = true) &&
                    n2.equals("N", ignoreCase = true) &&
                    i1.equals("I", ignoreCase = true) &&
                    n3.equals("N", ignoreCase = true) &&
                    i2.equals("I", ignoreCase = true)
        }

        fun Gentiletti(
            g: String,
            e: String,
            n: String,
            t: String,
            i: String,
            l: String,
            e2: String,
            t2: String,
            t3: String,
            i2: String
        ): Boolean {
            return g.equals("G", ignoreCase = true) &&
                    e.equals("E", ignoreCase = true) &&
                    n.equals("N", ignoreCase = true) &&
                    t.equals("T", ignoreCase = true) &&
                    i.equals("I", ignoreCase = true) &&
                    l.equals("L", ignoreCase = true) &&
                    e2.equals("E", ignoreCase = true) &&
                    t2.equals("T", ignoreCase = true) &&
                    t3.equals("T", ignoreCase = true) &&
                    i2.equals("I", ignoreCase = true)
        }

        fun Mas(m: String, a: String, s: String): Boolean {
            return m.equals("M", ignoreCase = true) &&
                    a.equals("A", ignoreCase = true) &&
                    s.equals("S", ignoreCase = true)
        }

        fun Villalba(
            v: String,
            i: String,
            l: String,
            l2: String,
            a: String,
            l3: String,
            b: String,
            a2: String
        ): Boolean {
            return v.equals("V", ignoreCase = true) &&
                    i.equals("I", ignoreCase = true) &&
                    l.equals("L", ignoreCase = true) &&
                    l2.equals("L", ignoreCase = true) &&
                    a.equals("A", ignoreCase = true) &&
                    l3.equals("L", ignoreCase = true) &&
                    b.equals("B", ignoreCase = true) &&
                    a2.equals("A", ignoreCase = true)
        }

        fun Mercier(
            m: String,
            e: String,
            r: String,
            c: String,
            i: String,
            e2: String,
            r2: String
        ): Boolean {
            return m.equals("M", ignoreCase = true) &&
                    e.equals("E", ignoreCase = true) &&
                    r.equals("R", ignoreCase = true) &&
                    c.equals("C", ignoreCase = true) &&
                    i.equals("I", ignoreCase = true) &&
                    e2.equals("E", ignoreCase = true) &&
                    r2.equals("R", ignoreCase = true)
        }

        fun Ortigoza(
            o: String,
            r: String,
            t: String,
            i: String,
            g: String,
            o2: String,
            z: String,
            a: String
        ): Boolean {
            return o.equals("O", ignoreCase = true) &&
                    r.equals("R", ignoreCase = true) &&
                    t.equals("T", ignoreCase = true) &&
                    i.equals("I", ignoreCase = true) &&
                    g.equals("G", ignoreCase = true) &&
                    o2.equals("O", ignoreCase = true) &&
                    z.equals("Z", ignoreCase = true) &&
                    a.equals("A", ignoreCase = true)
        }

        fun Piatti(p: String, i: String, a: String, t: String, t2: String, i2: String): Boolean {
            return p.equals("P", ignoreCase = true) &&
                    i.equals("I", ignoreCase = true) &&
                    a.equals("A", ignoreCase = true) &&
                    t.equals("T", ignoreCase = true) &&
                    t2.equals("T", ignoreCase = true) &&
                    i2.equals("I", ignoreCase = true)
        }

        fun Romagnoli(
            r: String,
            o: String,
            m: String,
            a: String,
            g: String,
            n: String,
            o2: String,
            l: String,
            i: String
        ): Boolean {
            return r.equals("R", ignoreCase = true) &&
                    o.equals("O", ignoreCase = true) &&
                    m.equals("M", ignoreCase = true) &&
                    a.equals("A", ignoreCase = true) &&
                    g.equals("G", ignoreCase = true) &&
                    n.equals("N", ignoreCase = true) &&
                    o2.equals("O", ignoreCase = true) &&
                    l.equals("L", ignoreCase = true) &&
                    i.equals("I", ignoreCase = true)
        }

        fun Matos(m: String, a: String, t: String, o: String, s: String): Boolean {
            return m.equals("M", ignoreCase = true) &&
                    a.equals("A", ignoreCase = true) &&
                    t.equals("T", ignoreCase = true) &&
                    o.equals("O", ignoreCase = true) &&
                    s.equals("S", ignoreCase = true)
        }

    }
