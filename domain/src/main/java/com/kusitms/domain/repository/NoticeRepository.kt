package com.kusitms.domain.repository

import com.kusitms.domain.model.notice.CommentContentModel
import com.kusitms.domain.model.notice.CommentModel
import com.kusitms.domain.model.notice.CurriculumModel
import com.kusitms.domain.model.notice.NoticeModel

interface NoticeRepository {

    suspend fun getNoticeList() : Result<List<NoticeModel>>

    suspend fun getNoticeDetail(
        noticeId : Int
    ) : Result<NoticeModel>

    suspend fun getCurriculumList() : Result<List<CurriculumModel>>

    suspend fun getCurriculumNoticeList(
        curriculumId : Int
    ) : Result<List<NoticeModel>>

    suspend fun getNoticeCommentList(
        noticeId: Int
    ) : Result<List<CommentModel>>

    suspend fun addNoticeComment(
        noticeId: Int,
        commentContentModel: CommentContentModel
    ) : Result<CommentModel>
}