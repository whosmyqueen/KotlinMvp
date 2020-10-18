package com.hazz.kotlinmvp.rx.scheduler

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers


/**
 * Created by xuhao on 2017/11/17.
 * desc:
 */


class SingleMainScheduler<T> private constructor() : BaseScheduler<T>(Schedulers.single(), AndroidSchedulers.mainThread())
