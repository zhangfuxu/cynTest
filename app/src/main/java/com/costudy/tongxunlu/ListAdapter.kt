package com.costudy.tongxunlu

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

/**
 * @author : 张富旭
 * time : 1/28/21 14
 * email : 2390109890@qq.com
 * des :
 */
class ListAdapter(datasList: MutableList<MyContacts>) : BaseQuickAdapter<MyContacts, BaseViewHolder>(R.layout.list_item, datasList) {
    override fun convert(holder: BaseViewHolder, item: MyContacts) {
        holder.setText(R.id.tv_name, item.name)
        holder.setText(R.id.tv_phone, item.number)
        holder.setText(R.id.tv_userid, item.userId)
    }
}