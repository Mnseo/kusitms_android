package com.kusitms.domain.usecase.home

import com.kusitms.domain.model.home.MemberInfoDetailModel
import com.kusitms.domain.repository.HomeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetMemberInfoDetailUseCase @Inject constructor(
    private val homeRepository: HomeRepository,
) {
    operator fun invoke(): Flow<MemberInfoDetailModel> = flow {
        homeRepository.getMemberInfoDetail().onSuccess {
            emit(it)
        }.onFailure { throw it }
    }
}