package layout

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mad_ind05_lastname_nithin.MainActivity2
import com.example.mad_ind05_lastname_nithin.R
import com.example.mad_ind05_lastname_nithin.databinding.RecyclerviewRowBinding

class MyAdapter(val stateList: List<States>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RecyclerviewRowBinding) : RecyclerView.ViewHolder(binding.root),
    View.OnClickListener{
        init {
            binding.root.setOnClickListener(this)
        }
        fun bindItem(states: States) {
            binding.tvStateName.text = states.sName
            binding.tvNickName.text = states.sNickName
        }

        override fun onClick(p0: View?) {
            p0?.let {
                val context = it.context
                val  intent = Intent(context, MainActivity2::class.java)
                    .putExtra("rowNum", adapterPosition.toString())
                    .putExtra("sName", binding.tvStateName.text)
                    .putExtra("sArea", stateList[adapterPosition].sArea)
                    .putExtra("sFlag", stateList[adapterPosition].sFlag)
                    .putExtra("sMap", stateList[adapterPosition].sMap)
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val state = stateList[position]
        holder.bindItem(state)
    }

    override fun getItemCount(): Int {
        return  stateList.size
    }
}