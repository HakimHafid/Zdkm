package id.dicoding.zodiakkim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

//class AdapterZodiaknya : Adapter<AdapterZodiaknya.ListViewHolder>{
class AdapterZodiaknya(private val listZodiak: ArrayList<Zodiak>) : RecyclerView.Adapter<AdapterZodiaknya.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.itemnya_zodiak, viewGroup, false)
        return ListViewHolder(view)
    }


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val zodiak = listZodiak[position]

        Glide.with(holder.itemView.context)
            .load(zodiak.photo)
            .apply(RequestOptions())//.override(100, 65))
            .into(holder.imgphoto)

        holder.tvName.text = zodiak.name
        holder.tvDetail.text = zodiak.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listZodiak[holder.adapterPosition]) }
    }


    override  fun getItemCount(): Int {
        return  listZodiak.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var tvName: TextView = itemView.findViewById(R.id.tv_namanya_zodiak)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detailnya_zodiak)
        var imgphoto: ImageView = itemView.findViewById(R.id.item_gambarnya_zodiak)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Zodiak)

    }
}


