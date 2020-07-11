package id.dicoding.zodiakkim

object IniDataZodiak {

    private val ZodiakNames = arrayOf(
        "Capricorn",
        "Aquarius",
        "Pisces",
        "Aries",
        "taurus",
        "Gemini",
        "Cancer",
        "Leo",
        "Virgo",
        "Libra",
        "Scorpio",
        "Sagitarius"
    )

    private val ZodiakDetails = arrayOf(
        "21 Desember - 19 Januari",
        "20 Januari - 18 Februari",
        "19 Februari - 20 Maret",
        "21 Maret - 20 April",
        "21 April – 20 Mei",
        "21 Mei - 20 Juni",
        "21 Juni - 20 Juli",
        "21 Juli - 21 Agustus",
        "22 Agustus - 22 September",
        "23 September - 22 Oktober",
        "23 Oktober – 22 November",
        "23 November - 20 Desember"
    )

    private val ZodiakPict = intArrayOf(
        R.drawable.capricorn,
        R.drawable.aquarius,
        R.drawable.pisces,
        R.drawable.aries,
        R.drawable.taurus,
        R.drawable.gemini,
        R.drawable.cancer,
        R.drawable.leon,
        R.drawable.virgo,
        R.drawable.libra,
        R.drawable.scorpio,
        R.drawable.sagitarius
    )

    val listData: ArrayList<Zodiak>
        get() {
            val list = arrayListOf<Zodiak>()
            for (position in ZodiakNames.indices) {
                val Zodiak = Zodiak()
                Zodiak.name = ZodiakNames[position]
                Zodiak.detail = ZodiakDetails[position]
                Zodiak.photo = ZodiakPict[position]
                list.add(Zodiak)
            }
            return list

        }
}


