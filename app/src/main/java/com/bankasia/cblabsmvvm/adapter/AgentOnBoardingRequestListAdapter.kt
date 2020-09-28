package com.bankasia.cblabsmvvm.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bankasia.cblabsmvvm.R
import com.bankasia.cblabsmvvm.datamodel.AgentOnBoardingRequestStatusDataM
import com.bankasia.cblabsmvvm.view.AgentOnBoardingRequestStatusDetailsV

class AgentOnBoardingRequestListAdapter(
    private val requestDetailsList: List<AgentOnBoardingRequestStatusDataM>,
    private val context: Context
) : RecyclerView.Adapter<AgentOnBoardingRequestListAdapter.Adapter>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.on_boarding_request_list_card, parent, false)
        return Adapter(view)
    }

    override fun onBindViewHolder(holder: Adapter, position: Int) {
        val requestList = requestDetailsList[position]
        holder.textViewRequestBy.text = requestList.REQ_ID
        holder.textViewRegion.text = requestList.REGION
        holder.textViewArea.text = requestList.AREA
        holder.textViewTerritory.text = requestList.TERITORY
        holder.textViewDst.text = requestList.DST
        holder.textViewReqType.text = requestList.REQ_TYPE
        holder.textViewDateAndTime.text = requestList.CREATE_DATE
    }

    override fun getItemCount(): Int {
        return requestDetailsList.size
    }

    inner class Adapter(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textViewRequestBy: TextView
        var textViewRegion: TextView
        var textViewArea: TextView
        var textViewTerritory: TextView
        var textViewDst: TextView
        var textViewReqType: TextView
        var textViewDateAndTime: TextView
        var textViewAction: TextView

        init {
            textViewRequestBy = itemView.findViewById<View>(R.id.tvReqBy) as TextView
            textViewRegion = itemView.findViewById(R.id.tvRegion)
            textViewArea = itemView.findViewById(R.id.tvArea)
            textViewTerritory = itemView.findViewById(R.id.tvTerritory)
            textViewDst = itemView.findViewById(R.id.tvDst)
            textViewReqType = itemView.findViewById(R.id.tvReqType)
            textViewReqType = itemView.findViewById(R.id.tvReqType)
            textViewDateAndTime = itemView.findViewById(R.id.tvReqDateTime)
            textViewAction = itemView.findViewById(R.id.tvAction)
            textViewAction.paintFlags = textViewAction.paintFlags or Paint.UNDERLINE_TEXT_FLAG
            textViewAction.setTextColor(Color.BLUE)

            textViewAction.setOnClickListener {
                val position = adapterPosition

                if (position != RecyclerView.NO_POSITION){

                    val selectedList: AgentOnBoardingRequestStatusDataM = requestDetailsList[position]
                    val intent = Intent(context, AgentOnBoardingRequestStatusDetailsV::class.java)
                    intent.putExtra("list", selectedList)
                    context.startActivity(intent)

                }else{
                    Toast.makeText(context, "No Position", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}